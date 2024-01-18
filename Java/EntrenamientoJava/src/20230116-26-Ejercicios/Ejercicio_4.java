package entrenamientoJava;

import java.util.Random;

/*
Ejercicio 4
Generar una matriz de 3×3 con números aleatorios sin repetirse. 
*/

public class Ejercicio_4 {

	public static void main(String[] args) {
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
