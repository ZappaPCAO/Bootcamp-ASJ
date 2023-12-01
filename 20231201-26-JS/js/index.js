function verLongitud(){
    const input = document.getElementById("palabra").value;
    
    console.log(`${input} tiene una longitud de ${input.length}` )
}

function edadEnDias(){
    const edad = parseFloat(document.getElementById("edad").value);

    const fechaAct = moment(new Date(),'YYYY-MM-DD'); // Fecha actual
    const fechaUno = moment('2023-01-01'); // Primer dia del año

    // Obtengo los dias que van del año.
    let contDias = fechaAct.diff(fechaUno, 'days');

    console.log(`Su edad en dias es ${contDias + (365*(edad - 1))}`)
}

sumaValores = () => {
    const valor1 = parseFloat(document.getElementById("valor1").value);
    const valor2 = parseFloat(document.getElementById("valor2").value);

    console.log(`La suma de los valores es: ${valor1 + valor2}`)
}