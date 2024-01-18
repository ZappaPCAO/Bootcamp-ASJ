package entrenamientoJava;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_6 {

/*
Ejercicio 6
Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, 
nos piden hacer un menú con estas opciones:

* Rellenar TODA la matriz de números, debes pedírselo al usuario.
* Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
* Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
* Sumar la diagonal principal (ver ejemplo)
* Sumar la diagonal inversa (ver ejemplo)
* La media de todos los valores de la matriz

IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar,
simplemente mostrar un mensaje donde diga que debes rellenar la matriz 
*/
	public static void main(String[] args) {
		int matriz[][] = null;
		int opcion = -1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1-Generar Matriz ; 2-Sumar una fila ; 3-Sumar una columna ; 4-Sumar diagonal principal \n"
				+ " 5-Sumar diagonal inversa ; 6-Media de todos los valores de la matriz ; "
				+ " 7-Mostrar matriz ; 0-Salir");
		
		while(opcion != 0) {
			try {
				System.out.print("Elija una opcion: ");
				opcion = scanner.nextInt();
			}catch(Exception error){
				System.out.println("Debe ingresar un numero !!");				
				scanner.nextLine();
				continue;
			}
			if(matriz == null && opcion != 1) {
				System.out.println("Antes de realizar alguna accion, debe completar la matriz.");
				continue;
			}
			if(opcion == 2 || opcion == 3) {
				int indice = 0;				
				
				do {
					System.out.println("Que " + 
						   ((opcion == 1) ? "fila" : "columna")
							+ " fila deseas sumar? [1;4]");
					try {
						indice = (scanner.nextInt() - 1);
					}catch(Exception error){
						System.out.println("Debe ingresar un numero !!");				
						scanner.nextLine();						
					}
										
					if(indice > 3 && indice < 0) {
						System.out.println("Fuera de rango, ingrese un numero valido !!");
					}
					
				}while(indice > 3 && indice < 0);				
				
				int arrAux[] = new int[4];
				
				for(int i=0;i<arrAux.length;i++) {
					arrAux[i] = matriz[i][indice];
				}
				
				System.out.println("La suma es: " + sumar(
							((opcion == 1) ? matriz[indice] : arrAux)
						)); 
			}
			switch(opcion){		
				case 1:
					matriz = generarMatriz();					
					break;		
				case 4:
					System.out.println("La suma de la diagonal principal es: " +
							sumarDiagonalPrincipal(matriz)
							);
					break;
				case 5:
					System.out.println("La suma de la diagonal inversa es: " +
							sumarDiagonalInversa(matriz)
							);
					break;
				case 6:
					System.out.println("La media de la matriz es: " +
							obtenerMedia(matriz)
							);
					break;
				case 7: 
					mostrarMatriz(matriz);
					break;
				default:
					break;
			}
		}
		
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int sumar(int arr[]) {
		int suma = 0;
		for(int i=0; i<arr.length; i++) {
			suma += arr[i];
		}
		return suma;
	}
	
	public static int sumarDiagonalPrincipal(int matriz[][]) {
		int suma = 0;
		
		for(int i=0; i<matriz.length; i++) {
			suma += matriz[i][i];
		}
		return suma;		
	}
	
	public static int sumarDiagonalInversa(int matriz[][]) {
		int suma = 0;
		int desc = matriz.length - 1;
		
		for(int i=0; i<matriz.length; i++) {
			suma += matriz[desc][i];
			desc--;
		}
		return suma;		
	}
	
	public static int[][] generarMatriz() {
		Random random = new Random();
		int matriz[][] = new int[4][4];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}
		return matriz;
	}
	
	public static double obtenerMedia(int matriz[][]) {
		int suma = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return (suma/(matriz.length + matriz[0].length));
	}

}
