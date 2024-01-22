let body = document.getElementById("tabla-alumnos");
let modalname = document.getElementById("nombre-alumno");
let modallastname = document.getElementById("apellido-alumno");
let modalnote = document.getElementById("promedio-alumno");
let modalId = document.getElementById("id-alumno");


window.addEventListener("load", () => {
	fetch("http://localhost:8080/alumnos")
	.then((response) => response.json())
	.then((json) => {
		
		for(let alumno of json){
			//Defino el tr:
			let tr = document.createElement("tr");
			//Defino las columnas de cada fila:
			let tdId = document.createElement("td");
			let tdname = document.createElement("td");
			let tdlastname = document.createElement("td");
			let tdnote = document.createElement("td");
			let tdAcciones = document.createElement("td");
			//Defino el contenido de cada columna:
			let id = document.createTextNode(alumno.id);
			let name = document.createTextNode(alumno.name);
			let lastname = document.createTextNode(alumno.lastname);
			let note = document.createTextNode(alumno.note);
			tdAcciones.innerHTML = `<button onclick="verAlumno(${alumno.id})" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"> Ver Alumno </button>`
			//Enlazo cada columna con su contenido:
			tdId.appendChild(id);
			tdname.appendChild(name);
			tdlastname.appendChild(lastname);
			tdnote.appendChild(note);
		 	//Enlazo cada columna al tr
		 	tr.appendChild(tdId);
		 	tr.appendChild(tdname);
		 	tr.appendChild(tdlastname);
		 	tr.appendChild(tdnote);
		 	tr.appendChild(tdAcciones);
			//Enlazo el tr con el table-body:
			body.appendChild(tr);
			
		}
	}) 
	.catch(() => console.error("Error al conectar con la API"));
});

function verAlumno(id){
	fetch(`http://localhost:8080/alumnos/${id}`)
	.then((response) => response.json())
	.then((json) => {
			modalname.innerText = json.name;
			modallastname.innerText = json.lastname;
			modalnote.innerText = json.note;
			modalId.innerText = json.id;	
	})
	.catch(() => console.error("Error al conectar con la API"));
}