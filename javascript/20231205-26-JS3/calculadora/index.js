// for (const it of btn) {
//     console.log(it.value);
// }

function operacion(numA, numB, operador){
    let resultado = 0, numeroA = +numA, numeroB = +numB;

    if(isNaN(numeroA) && isNaN(numeroB)){ // Controlo que sean un numeros.    
        alert(`No es posible realizar la operacion.`)
        return -1;
    }

    switch (operador) {
        case '+':
            resultado = numeroA + numeroB;
            break;
        case '-':
            resultado = numeroA - numeroB;        
            break;
        case '*':
            resultado = numeroA * numeroB;
            break;
        case '/':
            if(numeroB === 0){
                alert(`No es posible realizar una division por 0.`);
                return -1;
            }            
            resultado = numeroA / numeroB;
            break;
        default:
            alert(`Operador no reconocido.`)
            break;
    }
    return resultado;
}

function obtenerOperador(cadenaEval){
    const operadores  = ['-','+','*','/']; // Operadores posibles. 
    let indOperador = -1; // Uso -1 porq es el que indexOf le da cuando no encuentra resultados.

    for (const operador of operadores) {  // Obtengo el operador implicado
        indOperador = cadenaEval.indexOf(operador);
        if(indOperador !== -1)
            break;
    }

    return indOperador;
}

const arrBtns = document.getElementsByName("btn");
for (const it of arrBtns) {
    it.addEventListener("click",()=>{
        const pantalla = document.getElementById("pantalla"); // Display de la calculadora.
        const pantallaSec = document.getElementById("pantallaSecundaria"); // Display secundario de la calculadora.

        let valorPantalla = pantalla.value, resultado = 0; 
        
        if(it.value === 'B'){ // Si quiere limpiar la pantalla o una parte de la expresion.
            if(valorPantalla === '0'){                
                pantallaSec.value = '0';
                pantallaSec.style.display = 'none';
            }
            pantalla.value = '0';
            return true;
        }

        if(it.value === '='){              
            let valorPantallas = pantallaSec.value + valorPantalla; //concanteno el valor de las pantallas.
            let operadorIndice = obtenerOperador(valorPantallas);

            if(operadorIndice !== -1){ // Si encontro algun operador entra.
                let valores = valorPantallas.split(valorPantallas[operadorIndice]); 
                resultado = operacion(valores[0], valores[1], valorPantallas[operadorIndice]);
            }
            if(resultado === -1){
                pantallaSec.value = '0';
                pantallaSec.style.display = 'none';                
            }
            pantallaSec.value = valorPantallas;
        }

        let operador = obtenerOperador(it.value);

        if( (it.value !== '-') && ( valorPantalla == 0 &&   // Controlo que no quiera ingresar un operador sin haber ingresado un numero al menos.
            operador !== -1) ){                             // Si no es el -
                    alert(`No puede ingresar un operador sin antes ingresar un numero.`)
                    return 0;
            }

        if(operador !== -1 && valorPantalla !== '0'){ // Si ingreso un operador
            pantallaSec.value = valorPantalla + it.value;
            pantallaSec.style.display = "block";
            resultado = -1;
        }    
        
        if(it.value === '%'){ //Controlar
            resultado = valorPantalla / 100;
        }

        if(resultado === 0){ // Si no apreto el =
            resultado = (valorPantalla === '0') ? it.value : valorPantalla + it.value;
        }
             
        pantalla.value = (resultado === -1) ? '0' : resultado; // '-1' => controla errores, o cambio de pantalla.

        console.log(pantalla.value);       
    });
}


