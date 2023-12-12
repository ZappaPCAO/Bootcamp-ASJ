{/* <div class="container">
        <ul class="ciudades">
            <li>
                <span id="ciudad"></span><br>
                <span id="temperatura"></span><span id="grados"></span><br>
                <img id="wicon" src="" alt="Ícono del tiempo"><br>
                <span id="descripcion"></span><br>
            </li>
        </ul>
</div> */}

function cargarCiudad(ciudad){
    // ciudad = ciudad.length === 0 ? `buenos%20aires` : ciudad;
    fetch(`https://api.openweathermap.org/data/2.5/weather?q=${ciudad}&appid=dcec7df661b1e6b0edab51d796b7339c`)
        .then((response) => response.json())
        .then((json) => {
            document.querySelector(".container").style.visibility = "visible";

            nombre.innerText = `${json.name}`;
            console.log(json);
        })
        .catch((error) => "error");
}

const nombre = document.getElementById("ciudad");
const temperatura = document.getElementById("temperatura");
const iconTemp = document.getElementById("wicon");
const descripcion = document.getElementById("descripcion");
const getBtn = document.getElementById("getInfo");
const inputCiudad = document.getElementById("inputCiudad");

getBtn.addEventListener("click", () => cargarCiudad(inputCiudad.value));