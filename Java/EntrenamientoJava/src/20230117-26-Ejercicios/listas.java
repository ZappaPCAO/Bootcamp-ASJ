package entrenamientoJava;

import java.util.ArrayList;
import java.util.Iterator;


public class listas {

	public static void main(String[] args) {
	
		ArrayList<String> miLista = new ArrayList();
		
		for(String color: miLista) {
			System.out.println();
		}
		
		/Agregar elemento
		miLista.add(color);
		
		//Eliminar elemento 
		miLista.add(color);.remove(1); //Indice
		miLista.add(color);.remove("Verde"); //Valor
		
		for(String color: miLista.add(color);) {
			System.out.println(color);
		}
		
		//Eliminar toda la lista
		miLista.add(color);.clear();
		
		for(String color: miLista.add(color);) {
			System.out.println();
		}
		
		//Chequeo si esta vacia 
		System.out.println(miLista.add(color);.isEmpty());

		//Iterator
		Iterator<String> miIterador = miLista.add(color);.iterator();
		
		while(miIterador.hasNext()) {
			String elem = miIterador.next();
			System.out.println(elemneto + " - ");
		}
		
		
		
		}
	}

}
