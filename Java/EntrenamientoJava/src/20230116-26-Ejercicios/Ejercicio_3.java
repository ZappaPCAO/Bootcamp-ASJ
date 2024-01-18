package entrenamientoJava;

import java.util.Random;

public class Ejercicio_3 {
/*
	Ejercicio 3 
	Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
	que los almacene en un array. El programa debe ser capaz de pasar todos los números pares
	a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las
	celdas restantes. Utiliza arrays auxiliares si es necesario.
*/	
	public static void main(String[] args) {
		int arrayNumeros[] = new int[20];
		Random random = new Random();

		for(int i=0; i<arrayNumeros.length; i++) {			
	        arrayNumeros[i] = random.nextInt(100);		
		}
		
		int cont = 0;
		int aux = 0;
		
		for(int i=0; i<arrayNumeros.length;i++) {			
			cont = buscarPar(cont,arrayNumeros);
					
			if(cont == arrayNumeros.length-1) {
				if(arrayNumeros[cont]%2==0) { // Si es par y el ultimo reemplazo.
					aux = arrayNumeros[i];
					arrayNumeros[i] = arrayNumeros[cont];
					arrayNumeros[cont] = aux;
				}
				
				System.out.println("ARRAY DESORDENADO");
				
				for(int j=0; j<arrayNumeros.length; j++) 
					System.out.print(arrayNumeros[j] + "  ");
				
				ordenarArray(arrayNumeros);
				i=(arrayNumeros.length-1);
			}else if(cont == i) {			
				cont++;
			}else {				
				aux = arrayNumeros[i];
				arrayNumeros[i] = arrayNumeros[cont];
				arrayNumeros[cont] = aux;
			}			
		}
		
		
		System.out.println("\nARRAY ORDENADO");
		for(int i=0; i<arrayNumeros.length; i++) 
			System.out.print(arrayNumeros[i] + "  ");
	}
	
	public static int buscarPar(int index, int arr[]) {		
		while( arr[index]%2 != 0 && index < arr.length-1) 
			index++;
		
		return index; // retorna el indice o en caso que no haya pares el final.
	}
	
	public static void ordenarArray(int arr[]) {
		int i = 0;
		int j = 0;
		int aux = 0;
		
		while( (i<arr.length-1) && (arr[i]%2 == 0)) { // Pares			
			while(arr[j]%2 == 0 && (j+1) < arr.length) { // Pares 				
				if( arr[j] > arr[j+1] && arr[j+1]%2 == 0 ) {
					aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
				j++;
			}
			j = 0;
			i++;
		}
		
		int incioNew = i;
		j = i;
		
		while( (i<arr.length-1) && (arr[i]%2 != 0) ) { // Impares			
			while(arr[j]%2 != 0 && (j+1) < arr.length) { // Impares			
				if( arr[j] > arr[j+1] && arr[j+1]%2 != 0 ) {
					aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
				j++;
			}
			j = incioNew;
			i++;
		}
		
	}

}
