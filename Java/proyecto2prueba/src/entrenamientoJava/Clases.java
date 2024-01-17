package entrenamientoJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Clases {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Boolean band = true;		
		ArrayList<Ejecutable> ejecutable = new ArrayList();
		
		do {
			Password clave = null;
			System.out.println("1-Generar contraseña, longitud estandar 8 ; 2-Generar contraseña, longitud indicada; 3-Modo manual ; 0-Salir");
			System.out.print("Elija una opcion: ");
			
			switch(scanner.nextInt()) {
				case 1:					
					clave = new Password();					
					break;
				case 2:					
					System.out.print("\nLongitud: ");
					clave = new Password(scanner.nextInt());
					break;
				case 3:
					int longitud = 0; String contrasenia;
				
					System.out.print("\nLongitud: ");
					longitud = scanner.nextInt();
					System.out.print("\nContraseña: ");
					contrasenia = scanner.next();
					
					clave = new Password(longitud, contrasenia);
					break;
				case 0:
					band = false;
					break;
				default:
					break;				
			}
			if(clave != null) {
				Ejecutable ejecu = new Ejecutable(clave.getContrasenia(), clave.esFuerte());
				ejecutable.add(ejecu);
			}			
		}while(band);
		
		Iterator<Ejecutable> miIterador = ejecutable.iterator();
		
		while (miIterador.hasNext()) {			
			Ejecutable elemento = miIterador.next();			
		
		    System.out.println(elemento.toString());				
		}
	}

}
