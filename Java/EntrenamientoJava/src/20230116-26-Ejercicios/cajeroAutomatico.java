package entrenamientoJava;

import java.util.Scanner;
import java.util.Timer;

public class cajeroAutomatico {

	public static void main(String[] args) {
		double movimientos[][] = new double[4][10]; // Fila 1 -> Ingreso ; Fila 2 -> Retiro ; Fila 3 -> Pos
		int opcMenu = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		
		inicializarMatriz(movimientos);
		movimientos[1][0] = 10000.99; //Dinero inicial
		
		
		
		while(opcMenu != 0) {
			System.out.println("1-Ingresar dinero ; 2-Retirar dinero; 3-Consultar saldo; 4-Ver ultimos movimientos; 0-Salir");
			System.out.print("Elija una opcion: ");
			opcMenu = scanner.nextInt();
			
			System.out.println();
			switch(opcMenu) {
				case 1: 
					System.out.print("Cuanto dinero desea ingresar?: ");
					ingresarDinero(scanner.nextDouble(), movimientos);
					break;
				case 2: 
					double retiro = 0;
					System.out.print("Cuanto dinero desea retirar?: ");
					retiro = retirarDinero(scanner.nextDouble(), movimientos);
					
					if(retiro == 0) {
						System.out.println("Fondos insuficientes, su saldo en cuenta es: " +
								consultarSaldo(movimientos)
								);
					}					
					break;
				case 3: 
					System.out.println("Su dinero en cuenta es: " + 
								consultarSaldo(movimientos)
							);
					break;
				case 4: 
					ultimosMovimientos(movimientos);
					break;
				case 0:
					System.out.println("Se procedera a desconectar el sistema '\n' Muchas gracias !! :3");
					break;
				default:
					System.out.println("Opcion incorrecta, seleccione una valida !!");
					break;
			}
		}
		

	}
	
	public static double retirarDinero(double retiro, double mov[][]) {
		
		double saldo = consultarSaldo(mov);
		int cont = posicionarEnPrimerVacio('R',mov);
		
		if(saldo > 0 && saldo >= retiro) {
			mov[2][cont] = retiro;
			
			cont = posicionarEnPrimerVacio(' ', mov);
			
			mov[3][cont] = 2;
			
			return retiro;
		}
		
		return 0;
		
	}
	
	public static void ingresarDinero(double ingreso, double mov[][]) {
		int cont = posicionarEnPrimerVacio('I',mov);		
				
		if (ingreso > 0) {
			mov[1][cont] = ingreso;
			
			cont = posicionarEnPrimerVacio(' ', mov);
			mov[3][cont] = 1;
		}
	}
	
	public static double consultarSaldo(double mov[][]) {
		double ingresos = 0.0;
		double retiros = 0.0;
		
		for(int i=0; i<mov.length; i++) { 
			ingresos += mov[1][i];
			retiros += mov[2][i];
		}
		
		return (ingresos-retiros);
	}
	
	public static void ultimosMovimientos(double mov[][]) {
		int cantidadTotal = posicionarEnPrimerVacio(' ', mov);
		int contadorIngreso = 0;
		int contadorRetiro = 0;
		
		System.out.println("ULTIMOS MOVIMIENTOS");
		System.out.println("___________________");
		
		for(int i=0; i<cantidadTotal;i++) {
			if(mov[3][i] == 1) { // Ingreso
				System.out.println("Ingreso: $" + mov[1][contadorIngreso++]);
			}else if(mov[3][i] == 2) { // Retiro
				System.out.println("Retiro: $" + mov[2][contadorRetiro++]);
			}else {
				System.out.println("Otra operacion.");
			}			
		}
	}
	
	public static int posicionarEnPrimerVacio(char transaccion, double mov[][]) {
		int cont = 0;
		
		// Ternaria => I = Ingreso, R = Retiro
		while(mov[ (transaccion == 'I')? 1 :(transaccion == 'R')? 2 : 3 ][cont] != 0) {
			cont++;
		}
		
		return cont;
	}
	
	public static void inicializarMatriz(double mov[][]) {
		for(int i=0; i<mov.length; i++) { 
			for(int j=0; j<mov[i].length; j++) { 
				mov[i][j] = 0;
			}
		}
	}		
}
