let alumnos = [
    {
      nombre: "Mariano Damian",
      apellido: "Hernandez",
      notas: [8, 7, 9, 10, 6],
    },
    {
      nombre: "Ramiro",
      apellido: "Diaz",
      notas: [1, 3, 8, 2, 1],
    },
    {
      nombre: "Ana",
      apellido: "Armella",
      notas: [5, 7, 9, 4, 2],
    },
    {
      nombre: "Romina",
      apellido: "Almeda",
      notas: [10, 6, 7, 5, 9],
    },
    {
      nombre: "Denis",
      apellido: "Tolaba",
      notas: [10, 10, 9, 9, 10],
    },
    {
      nombre: "Hugo",
      apellido: "Castellano",
      notas: [2, 3, 3, 6, 1],
    },
    {
      nombre: "Analia Daiana",
      apellido: "Fonseca",
      notas: [4, 3, 4, 5, 2],
    },
    {
      nombre: "Francisco Daniel",
      apellido: "Samir",
      notas: [5, 5, 6, 4, 2],
    },
  ];

function condicionAlumnos (alumnos, condicion){ // tomo el parametro condicion como si fuera un booleano

let alumnosAux = [];

    for (const al of alumnos) {
        prom = ( al.notas.reduce((ac, cv) => ac + cv, 0)/al.notas.length ) // Sumo las notas de cada usuario del array.

        if (condicion && prom >= 6 ) // Si la condicion es true => "aprobados", me fijo si el promedio es mayor o igual a 6.
            alumnosAux.push({         // Agrego un elemento al array auxiliar.
                nombreCompleto: al.nombre + ' ' + al.apellido,
                promedio: prom,
                estado: "Aprobado",                
            })
        else if(!condicion && prom < 6)
            alumnosAux.push({
                nombreCompleto: al.nombre + ' ' + al.apellido,
                promedio: prom,
                estado: "Desaprobado",                
            })
    }
    return alumnosAux;
}