import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/* Ejercicio 1 */
		
		/*int[] num = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("Ingresa un numero: ");
			num[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println("Numero "+i+": " + num[i]);
		}*/
		
		/* Ejercicio 2 */
		
		/*System.out.println("Ingresa un numero: ");
		int numero = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Ingresa una palabra: ");
		String palabra = scanner.nextLine();
		
		System.out.println("Ingresa un numero con decimales: ");
		double decimal = scanner.nextDouble();
		
		System.out.println("Numero: " + numero);
		System.out.println("Palabra: " + palabra);
		System.out.println("Decimal: " + decimal);*/
		
		/* Ejercicio 3 */
		/*System.out.println("Ingresa un numero:" );
		int numero = scanner.nextInt();
		
		while(numero > 0 && numero <= 100) {
			boolean par = (numero%2 == 0);
			
			if( par && ( numero >= 2 && numero <= 5 || numero > 20 ) ) 
				System.out.println("No Weird");
			else 
				System.out.println("Weird");
			
			System.out.println("Ingresa un numero o sal del rango 1-100, para salir: ");
			numero = scanner.nextInt();
		}*/
		
		/* Ejercicio 4 */
		/*System.out.println("Ingresa un numero dentro del rango [2,20]:" );
		int numero = scanner.nextInt();
		
		while(numero < 2 || numero > 20) {
			System.out.println("Ingrese un numero valido: ");
			numero = scanner.nextInt();
		}
		
		for(int i = 0; i<11; ++i) {
			System.out.println(numero + "x" + i + ": " + numero*i);
		}
		*/
		
		//S2 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98
		//0 <= q <= 500
		//0 <= a, b <= 50
	    //1 <= n <= 15
		int[] n = new int[4];
		
		System.out.println("Ingrese Q, rango [0,500]:  ");
		n[0] = scanner.nextInt();
		
		System.out.println("Ingrese 2 numeros, rango [0,50]: ");
		n[1]=scanner.nextInt();
		n[2]=scanner.nextInt();
		
		System.out.println("Ingrese n, rango [1, 15]: ");
		n[3]=scanner.nextInt();
		
		boolean band = true;
		while(band) {
			band = !(n[0] >= 0 && n[0] <= 500);
			
			if(!band) {
				band = !( (n[1] >= 0 && n[1] <= 50) && (n[2] >= 0 && n[2] <= 50) );
				
				if(!band) {
					band = !(n[3] >= 1 && n[3] <= 15);		
					
					if(band) {
						System.out.println("Ingrese n, rango [1, 15]: ");
						n[3] = scanner.nextInt();
					}
				}else {
					System.out.println("Ingrese 2 numeros, rango [0,50]: ");
					n[1]=scanner.nextInt();
					n[2]=scanner.nextInt();
				}
			}else {
				System.out.println("Ingrese Q, rango [0,500]:  ");
				n[0] = scanner.nextInt();
			}
		}
		String algo = "";
		
		for(int i = 1; i<=n[3]; ++i) {
			algo = "S"+i+"= "+n[1];
			int acum = 0;
			System.out.println(i);
			for(int j = 1; j<=i; ++j){
				algo += ( "+" + Math.pow(j,2) + "*" + n[2]);
				acum += n[1]+Math.pow(j,2)*n[2];
			}			
			algo += "= " + acum;
			System.out.println(algo);
		}
				
		scanner.close();
	}
}