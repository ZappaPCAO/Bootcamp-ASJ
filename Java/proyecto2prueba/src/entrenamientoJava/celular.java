package entrenamientoJava;

import java.util.Scanner;

public class celular {
	// llega una cadena de numeros ej "1112223211" 
	public static void main(String[] args) {
		String msj = "";
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número para la codificar:");
        String cadenaInput = scanner.nextLine();
       
        String palabra = decodificar(cadenaInput);

        System.out.println("La palabra correspondiente es: " + palabra);

        scanner.close();
	}    
	
	public static String decodificar(String cadena) {
		char letras[][] = { {' '}, null, {'a','b','c'} , {'d','e','f'},
							{'g','h','i'}, {'j', 'k', 'l'}, {'m','n','o'},
							{'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'} };
		
		int cont = 0;
		char aux, numero;
		String codificado = "";
		
		System.out.println(cadena);
		
		for(int i=0; i<cadena.length(); i++) {
			numero = cadena.charAt(i); // la letra
			
			if(numero == ' ')
				continue;
			
			aux = numero;	
			
			i++;
			
			while(numero == aux && (i + cont) < cadena.length()) {
				aux = cadena.charAt( i + cont );				
				cont++;
			}
			
			System.out.println(letras[Character.getNumericValue(numero)][( ( (cont == 0) ? 0 : (cont-1) ) )]);			
			codificado += letras[Character.getNumericValue(numero)][( ( (cont == 0) ? 0 : (cont-1) ) )]; // aca se rompe
			i += (cont-1);
			cont = 0;		 
		}
		
		return codificado;		
	}
	
	
}
