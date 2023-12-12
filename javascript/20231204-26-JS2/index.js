// function parimpar(){
//     let num = prompt("Ingrese un numero: ")%2;
//     switch (num) {
//         case 0:
//             alert("es par");
//             break;    
//         default:
//             alert("no es par");
//             break;
//     }
// }

// // Ejer 1. Traducir
// function traducirPalabra(){
//     let palabra = prompt("Ingrese una palabra: ");
//     switch (palabra) {
//         case "casa":
//             alert("casa => home");
//             break;
//         case "perro":
//             alert("perro => dog");
//             break; 
//         case "pelota":
//             alert("pelota => ball");
//             break;
//         case "arbol":
//             alert("arbol => tree");
//             break;
//         case "genio":
//             alert("genio => genius");
//         default:
//             alert("Palabra no encontrada");
//             break;
//     }
// }

// // Ejer 2. Valorar
// function valorarPelicula(){
//     let valoracion = prompt("del 1 al 5 que tanto te gusto la pelicula?").toLowerCase();
//     switch (valoracion) {
//         case '1':
//             alert("Calificaste la pelicula como 'muy mala'. Lo lamentamos mucho.");
//             break;
//         case '2':
//             alert("Calificaste la pelocula como 'mala'. Lo lamentamos mucho.");
//             break; 
//         case '3':
//             alert("Calificaste la pelocula como 'mediocre'. Trataremos de hacerlo mejor la proxima vez.");
//             break;
//         case '4':
//             alert("Calificaste la pelocula como 'buena'. Nos pone contentos que te haya gustado.");
//             break;
//         case '5':
//             alert("Calificaste la pelocula como 'muy buena'. Muchas gracias.");
//             break;
//         default:
//             alert("Ingresaste un valor invalido.");
//             break;
//     }

//     alert("Muchas gracias por su valoracion!!")
// }

// Ejer 3. Sumatoria
// function sumar(num){
//     let acum = 0, cont = 0;
//     for (let i = num; i > 0; --i) {
//         acum += i;
//         cont++;
//     }
//     console.log(`La sumatoria de todos los numeros posteriores al ingresado es: ${acum} y su promedio es: ${acum/cont}`);
// }

// let num = parseInt(prompt("ingrese un numero: "));


// while(isNaN(num)){
//     alert("el numero ingresado no es numero, por favor ingrese otro.");
//     num = parseInt(prompt("ingrese un numero: "));
// }

// sumar(num);

// Ejer 4. Contador de positivos.
// function ingresarNumeros(){
//     let band, numAux, arrNum = [];

//     do{
//         numAux = parseInt(prompt("Ingrese un numero, en caso de no querer ingresar otro ingresa un valor negativo."));

//         if(!isNaN(numAux))
//             arrNum.push(numAux);
//         else alert("Debe ingresar un numero... Pruebe nuevamente");
        
//         band = (numAux < 0) ? false : true;
//     }while(band)

//     alert(`La cantidad de numeros positivos que ingreso es ${arrNum.length - 1}`);
// }

// ingresarNumeros();

// FizzBuzz
// En este ejercicio deberás escribir un programa que imprima en la consola los números del 1 al 100, teniendo en cuenta estos criterios:

// Si el número es múltiplo de 3, deberá imprimir "Fizz" en vez del número.
// Si es múltiplo de 5, deberá imprimir "Buzz".
// Si es múltiplo de 3 y de 5 (a la misma vez), deberá imprimir "FizzBuzz".

// function main(){
//     let i = 1, message;
    
//     while(i <= 100){

//         if((i%3===0)) 
//             message = "Fizz";
//         if((i%5===0)) 
//             message += "Buzz";

//         // message = (i%3===0) ? (i%5===0) ? "FizzBuzz" : "Fizz" : (i%5===0) ? "Buzz" : " X ";

//         console.log(`El numero es ${i} -> ${message}`);
        
//         ++i;
//     }
// }

// main();

// function main(){
//     let art1 = {nombre: "sopa", precio: 20}, art2 = {nombre: "pizza", precio: 120}, art3 = {nombre: "cafe", precio: 35.5}, art4 = {nombre: "cerveza", precio: 10.50}
//     let chiste1 = "Copiar y pegar fue programado por programadores para programadores en realidad.", chiste2 = "¿Por qué el programador renunció a su trabajo? Porque no consiguió arreglos (un aumento)."
//     let band = false, propina = false;

//     let montoAcumulado = 0, opc = 0;

//     opc = parseInt(prompt("Hola, en que lo puedo ayudar? \n1-Pedir carta \n2-Cuentame un chiste \n3-Pedir cuenta \n4-Pagar \n5-Salir "));

//     while (!band){
        
//         if(!opc) // Si le dio a cancelar
//             opc = 5;

//         if(isNaN(opc)){
//             alert("Debe ingresar un numero.");
//             continue;
//         }

//         switch (opc) {
//             case 1:
//                 opc = parseInt(prompt(`CARTA - - - - - PRECIO\n1-${art1.nombre+"   "+art1.precio} \n2-${art2.nombre+"   "+art2.precio} \n3-${art3.nombre+"   "+art3.precio} \n4-${art4.nombre+"   "+art4.precio} \n5-Salir`));
//                 do{
//                     switch (opc) {
//                         case 1:
//                             montoAcumulado += art1.precio;
//                             break;
//                         case 2:
//                             montoAcumulado += art2.precio;                        
//                             break;
//                         case 3:
//                             montoAcumulado += art3.precio;
//                             break;
//                         case 4:
//                             montoAcumulado += art4.precio;
//                             break;    
//                         default:
//                             break;
//                     }
//                     if(confirm("desea agregar algo mas?"))
//                         opc = parseInt(prompt(`CARTA ------------------ PRECIO\n1-${art1.nombre+"   "+art1.precio} \n2-${art2.nombre+"   "+art2.precio} \n3-${art3.nombre+"   "+art3.precio} \n4-${art4.nombre+"   "+art4.precio} \n5-Salir`));    
//                     else 
//                         break;
//                 }while(opc !== 5)
//             break;

//             case 2:
//                     alert(`Ahi va el mejor chiste \n${( (Math.floor(Math.random() * 100))%2===0) ? chiste1 : chiste2}`);
//             break;
//             case 3:
//                 propina = confirm("Desea dejar propina?")

//                 alert( (montoAcumulado === 0) ? "Usted no ha pedido nada." : `Su cuenta es: "$"${Math.round((propina) ? montoAcumulado*1.1 : montoAcumulado)}` )
//             break;
//             case 4:
//                 propina = confirm("Desea dejar propina?")
//                 alert( (montoAcumulado === 0) ? "Usted no debe pagar nada." : `El monto pagado es: "$"${Math.round((propina) ? montoAcumulado*1.1 : montoAcumulado)}` );
//                 montoAcumulado = 0;
//             break;
//             case 5:
//                 if(montoAcumulado > 0)
//                     alert(`debe pagar antes de irse. Monto a pagar $${Math.round(montoAcumulado)}`);
//                 band = true;
//             break;
//             default:
//                 return 0;                
//         }

//         if(!band)
//             opc = parseInt(prompt("Lo puedo ayudar en algo mas? \n1-Pedir carta \n2-Cuentame un chiste \n3-Pedir cuenta \n4-Pagar \n5-Salir "));
//     };
//     alert("Nos vemos, muchas gracias. Que tenga un lindo dia.");
// }

// // ejercicio piramide
// function main(){
//     let rango = +prompt("Ingrese la dimension de la piramide");
//     let concatMsg = "", concatMsgInv = "";

//     for (let i = 0; i < rango; i++){
//         for (let j = 0; j < i; j++) 
//             concatMsg += '*';              
        
//         for (let j = rango - i; j > 0; j--) 
//             concatMsgInv += '*'; 
        
//         concatMsgInv += '\n';
//         concatMsg += '\n';
//     }         
//     console.log(concatMsg + concatMsgInv);
// }



// // Ejercicio factorial de un numero.
// function main(){
//     let numero = parseInt(prompt("Ingrese un numero a sacar el factorial: ")), result = 1;

//     for (let i = 1; i <= numero; i++)
//         result*=i;
    
//     console.log(`El resultado es: ${result}`);
// }

main()