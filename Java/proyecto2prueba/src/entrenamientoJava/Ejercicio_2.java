package entrenamientoJava;

import java.util.Scanner;

//Ejercicio 2 
//Escribe un programa que lea 15 números por teclado y que los almacene en un array.
//Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
//el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
//Finalmente, muestra el contenido del array.

public class Ejercicio_2 {

	public static void main(String[] args) {
		int arrayNumeros[] = new int[15];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa 15 numeros por teclado: ");
		for(int i=0; i<arrayNumeros.length; i++) {
			try {
				arrayNumeros[i] = scanner.nextInt();
			}catch(java.util.InputMismatchException e){
				System.out.println("Debe ingresar un numero !!");				
				scanner.nextLine();
				i--;
			}
			
			if(i == (arrayNumeros.length - 2)) {
				System.out.println("Ultimo numero: ");
			}else if(i != (arrayNumeros.length - 1)) {
				System.out.print(" - ");
			}			
		}
		
		System.out.println("Array original");
		for(int i=0; i<arrayNumeros.length; i++) {
			
			if(i != (arrayNumeros.length - 1)) {
				System.out.print(arrayNumeros[i] + " - ");
			}else {
				System.out.println(arrayNumeros[i]);
				i = 0; // Reinicio para mostrar el invertido
				
				System.out.println("Array invertido");
				moverArray(arrayNumeros);
				
				while(i < (arrayNumeros.length - 1)) {
					System.out.print(arrayNumeros[i] + " - ");
					i++;
				}
				System.out.print(arrayNumeros[i]);
			}
		}

	}

	public static void moverArray(int arr[]) {
		int aux = 0;
		int aux2 = arr[arr.length-1];
		
		for(int i=0; i<arr.length; i++) {
			aux = arr[i];
			arr[i] = aux2;
			aux2 = aux;			
		}
		
	}
	
	public static void invertirArray(int arr[]) {
		int aux = 0;
		int dec = arr.length-1;
		int cont = 0;
		
		while(cont != dec) {
			aux = arr[dec];
			arr[dec--] = arr[cont];
			arr[cont++] = aux;
		}		
	}
}
