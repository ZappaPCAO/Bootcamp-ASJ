function fibonacci(value){
    // const arrFibonacci = new Array(value);

    // arrFibonacci.forEach(
    //     (el,index,arr) => {
    //         if(index < 2)
    //             arr[index] = index === 1 ? 1 : 0;
    //         else{
    //             arr[index] = arr[index-1] + arr[index-2];
    //         }
    //     }
    // );
    
    const arrFibonacci = [0,1];

    for (let i = 0; i < value; i++) {
        arrFibonacci.forEach(
            (el,index,arr)=>{
                if(index === i)
                    arrFibonacci.push(el + arr[index+1]);
            }
        );
    }

    return arrFibonacci;
}

function secuenciaFibonacci(){
    const arrFibonacci = fibonacci(+prompt(`Ingrese el rango de la secuencia: `));

    alert(arrFibonacci);
}