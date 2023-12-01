function par(){
    let num = prompt("Ingrese un numero para ver si es par."); // Solicito el valor a analizar al usuario.
    
    console.log(`el numero pasado es ${num%2===0 ? "par" : "impar"}`);   // Con el operador del residuo y comparando si es igual a 0 saco la paridad.
};
