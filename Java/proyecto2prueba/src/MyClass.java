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
		/*int[] n = new int[4];
		
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
		

		int entero;
		byte miByte;
		double doble;
		float flotante;
		short miShort;
		long miLong;
		boolean booleano;
		char caracter;
		String string;
		
		doble = 23.12;
		
		entero = (int) (doble/3);
		
		System.out.println("Tipo: Minimo - Maximo");
		System.out.println("int: Min = " + Integer.MIN_VALUE + " - Max = " + Integer.MAX_VALUE);
		System.out.println("byte: Min = " + Byte.MIN_VALUE + " - Max = " + Byte.MAX_VALUE);
		System.out.println("double: Min = " + Double.MIN_VALUE + " - Max = " + Double.MAX_VALUE);
		System.out.println("float: Min = " + Float.MIN_VALUE + " - Max = " + Float.MAX_VALUE);
		System.out.println("short: Min = " + Short.MIN_VALUE + " - Max = " + Short.MAX_VALUE);
		System.out.println("long: Min = " + Long.MIN_VALUE + " - Max = " + Long.MAX_VALUE);
		System.out.println("boolean: Min = " + false + " - Max = " + true);
		System.out.println("char: Min = " + 1 + " - Max = " + 1); 
		
		// ACTIVIDAD JAVA

		// Dada una palabra ingresada por el usuario (por teclado), mostrar su equivalente en ASCII (letra por letra)
		// Ej: Hola ---> 72 111 108 97
		// Extra: agregarle los espacios en blanco
		System.out.print("Ingresa una palabra: ");
		String palabra = scanner.nextLine();
		
		double letraAscii;
		
		System.out.println(letraAscii);	
		
		String newPalabra = "";
		
		System.out.print("Su palabra en codigo ASCII: ");
		for(int i = 0; i<palabra.length(); i++) {
			letraAscii = palabra.charAt(i);			
			
			newPalabra += (letraAscii == 32) ? " " : letraAscii;		
			
			//newPalabra += (letraAscii + " ");			 
		}
		System.out.println(newPalabra);	*/
		
		//EJERCICIO

		//Pedir al usuario que ingrese ¿cuántas notas quiere ingresar?
		//Según eso, pedir el valor de cada nota (1 al 10)
		//Sacar el promedio

		//Aclaración: hacerlo con FOR, WHILE y DO-WHILE
		
//		int[] notas;
//		int notaAux;
//		int cont = 0;
//		int cantNotas = 0;
//				
//		System.out.print("cuantas notas quiere ingresar?");
//		cantNotas = scanner.nextInt();
//		
//		notas = new int[cantNotas];
//		
//		System.out.println("Con que lo quiere recorrer");
//		System.out.println("1-do while ; 2-while ; 3-for");		
//		switch(scanner.nextInt()) {
//			case 1:
//				do {
//					System.out.print("Ingrese una nota [1;10]: ");
//					notaAux = scanner.nextInt();
//					
//					if(notaAux <= 10 && notaAux >= 1) {
//						notas[cont++] = notaAux;
//					}else {
//						System.out.println("Debe estar en el rango [1;10]");
//					}			
//				}while(cont < cantNotas);
//				break;
//			case 2:
//				while(cont < cantNotas) {
//					System.out.print("Ingrese una nota [1;10]: ");
//					notaAux = scanner.nextInt();
//					
//					if(notaAux <= 10 && notaAux >= 1) {
//						notas[cont++] = notaAux;
//					}else {
//						System.out.println("Debe estar en el rango [1;10]");
//					}
//				}
//				break;
//			case 3:
//				for(cont = 0; cont < cantNotas; cont++) {
//					System.out.print("Ingrese una nota [1;10]: ");
//					notaAux = scanner.nextInt();
//					
//					if(notaAux <= 10 && notaAux >= 1) {
//						notas[cont] = notaAux;
//					}else {
//						cont--;
//						System.out.println("Debe estar en el rango [1;10]");
//					}		
//				}
//				break;
//		}		
//			
//		double prom = 0;
//		System.out.print("Notas: ");
//		for(cont = 0; cont < cantNotas; cont++) {
//			System.out.print(notas[cont] + " ");
//			prom += notas[cont];
//		}
//		System.out.println();
//		System.out.println("Total: " + (int)prom);
//		
//		System.out.println("Promedio: " + (prom/notas.length));
		
		
		
		
		
		
		
		
//		Crear un programa donde se introduzcan los tres ángulos internos de un triángulo y 
//		se determine si el triángulo es válido o no.
		
//		int sumaAngInt = 0;
//		
//		System.out.println("Ingrese 3 angulos internos, para determinar si pertenecen a un triangulo: ");
//		
//		for(int i = 0; i<3; i++)
//			sumaAngInt += scanner.nextInt();
//		
//		System.out.println("Los angulos ingresados " + ((sumaAngInt != 180) ? "no pertenecen" : "pertenecen") + " a un triangulo." );
//		
//		Crear un programa que determine si un string introducido por un usuario empieza con un número o con una letra.
		
//		System.out.println("Ingrese una palabra u oracion: ");
//		char cadena = scanner.nextLine().charAt(0);
//		
//		System.out.println("La cadena ingresada empieza con " + 
//			((cadena >= 48 && cadena <= 57) ? "un numero." : 
//			 ( (cadena >= 65 && cadena <= 90) ||
//					 (cadena >= 97 && cadena <= 122) ) ? "una letra." : "un caracter raro."));
		
		
//		Realizar la suma de todos los números pares entre N y M donde N y M los ingresa un usuario.
		
//		System.out.println("Ingrese los limites, tanto inferior como superior: ");
//		int inf, sup;
//		inf = scanner.nextInt();
//		sup = scanner.nextInt();
//		
//		if(inf > sup) {
//			int aux = sup;
//			sup = inf;
//			inf = aux;
//		}
//		
//		while(inf == sup) {
//			System.out.println("Los limites son iguales, volve a ingresar el limite superior, tiene que ser mayor a " + inf +". ");
//			sup = scanner.nextInt();
//		}
//		
//		
//		int pares = 0;
//		
//		System.out.println(inf + "-" + sup);
//		
//		for(int i = inf; i <= sup; i++) 
//			pares += (i%2==0) ? i : 0;
//			
//		System.out.println("La suma de todos los numeros pares en ese rango de valores es: " + pares);
		
//		Crear un programa que determine si un número es perfecto o no, 
//		(se dice que un número es perfecto si el número es igual a la suma de sus divisores positivos,
//		excluido él mismo., Ejemplos 6 = 1 + 2 + 3)
		
//		System.out.println("Ingrese un numero para saber si es perfecto: ");
//		int perfecto = 0;
//		perfecto = scanner.nextInt();
//		
//		int sumaDivisores = 0;
//		
//		for(int i=1; i<perfecto; i++) 
//			sumaDivisores += (perfecto%i == 0) ? i : 0;
//		
//		System.out.println("El numero " + ((sumaDivisores == perfecto) ? "es" : "no es") + " perfecto.");
		
//		Recrear el siguiente dibujo:(ver imagen)
//		Ej: en este caso, el usuario ingresó 8
		
		System.out.println("Ingrese la cantidad de renglones: ");
		int renglones = 0;
		renglones = scanner.nextInt();
		
		String cadena = "";
		
//		for(int i = 1; i<=renglones; i++) 
//			cadena += (i%2!=0) ? "* * * * * * * *\n" : " * * * * * * * \n";
		
		for(int i = 1; i<=renglones; i++) {
			if (i%2!=0) {
				for(int j=0; j<renglones; j++) { 
					cadena += "* ";
				}				
			}else {
				for(int j=0; j<renglones-1; j++) { 
					cadena += " *";
				}
			}
			cadena += "\n";
		}			
		
		System.out.println(cadena);
		
		scanner.close();			
	}
}