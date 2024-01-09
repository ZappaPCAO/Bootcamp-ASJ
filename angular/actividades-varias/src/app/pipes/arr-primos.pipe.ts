import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'arrPrimos'
})
export class ArrPrimosPipe implements PipeTransform {

  transform(numeros: number[], ...args: unknown[]): unknown {
    let arrPrimos: number[] = [];
    
    for (const numero of numeros) {
      let esPrimo = true;

      if(numero === 1)
        continue;     
      
      for (let j = 2; j < numero-1; j++) 
        if (esPrimo && numero%j == 0)
          esPrimo = false;
      
      if (esPrimo)
        arrPrimos.push(numero);
    }

    return arrPrimos;
  }

}
