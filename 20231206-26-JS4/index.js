const tecleo = document.getElementById("palabra");
palabra.addEventListener("keyup", (event) => {
    if (event.isComposing) {
      return;
    }

    const textoSalida = document.getElementById("result");
    
    if(event.keyCode === 8){
        textoSalida.innerHTML = tecleo.value;
    }

    if( (event.keyCode >= 48 && event.keyCode <= 90)  ||                          // Letras y numeros.
        (event.keyCode >= 96 && event.keyCode <= 111) ||                          // Algunos caracteres especiales y pad numerico.
        (event.keyCode >= 186 && event.keyCode <= 222)|| (event.keyCode === 32)){ // Espacio y caracteres especiales.
            textoSalida.innerHTML += String.fromCharCode(event.keyCode);
    }

    textoSalida.innerHTML = textoSalida.innerHTML.replace(/[AEIOU]/i, '_');

    // if(event.keyCode === 8){ // Para borrar.
    //     textoSalida.innerHTML = textoSalida.innerHTML.substring(0, textoSalida.innerHTML.length - 1);
    //     return;
    // }
  });