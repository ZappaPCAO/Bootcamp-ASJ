package entrenamientoJava;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		int matrizAux[][] = new int[4][4];
		int matriz[][] = ejercicio4();
		int suma = 0;
		int rand = 0;
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		rand = random.nextInt(3);
		
		for(int i=0; i<matrizAux.length-1; i++) {
			for(int j=0; j<matrizAux[i].length-1;j++) {
				matrizAux[i][j] = matriz[i][j];				
			}
		}
		
		System.out.println("Que queres sumar? F -> Fila || C -> Columna");
		String algo = scanner.next();
		
		System.out.println(algo + "holaaa");
		switch(algo) {
			case "F":
				for(int i=0; i<matrizAux[rand].length-1; i++) {
					suma += matriz[rand][i];					
				}
				matrizAux[rand][3] = suma;
				break;
			case "C":
				for(int i=0; i<matrizAux.length-1; i++) {
					suma += matriz[i][rand];
				}
				matrizAux[3][rand] = suma;
				break;
			default:
				System.out.println("Opcion incorrecta !!");
				break;
		}		
		for(int i=0; i<matrizAux.length; i++) {
			for(int j=0; j<matrizAux[i].length;j++) {
				System.out.print(matrizAux[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] ejercicio4() {
		int matriz[][] = new int[3][3];
		
		Random random = new Random();
		
		matriz[0][0] = random.nextInt(100);
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
				int aux = random.nextInt(100); 
				
				while(verificar(matriz, aux)) {
					aux = random.nextInt(100);
				}
				
				matriz[i][j] = aux; 
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		return matriz;
	}
	
	public static boolean verificar(int arr[][], int random) {
		int i = 0;
		int j = 0;
		boolean band=false;
		
		while(i < arr.length && !band) {
			while(j < arr[i].length && !band){
				band = (arr[i][j] == random);
				j++;
			}
			j=0;
			i++;
		}
		return band;
	}

}
