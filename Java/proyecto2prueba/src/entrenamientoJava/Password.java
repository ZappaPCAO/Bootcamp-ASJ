package entrenamientoJava;

import java.util.Random;

/*
3) Haz una clase llamada Password que siga las siguientes condiciones:
Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Un constructor por defecto.
Un constructor con la longitud que nosotros le pasemos. Generara una contraseña
aleatoria con esa longitud.
Los métodos que implementa serán al menos:

    -- esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe
tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
    -- generarPassword(): genera la contraseña del objeto con la longitud que
tenga.
   -- Método get para contraseña y longitud.
   -- Método set para longitud.

Ahora, crea una clase clase ejecutable:
Obtener por teclado, contraseñas ingresadas por el usuario (pueden utilizar arrays o ArrayList).
Mostrar todas las contraseñas y si son fuertes o no

Ej: 
contraseña_1 FUERTE
  contraseña_2 DEBIL
  contraseña_3 FUERTE 
 
*/

public class Password {
	
	private Integer longitud;
	private String contrasenia;
	
	public Password() {		
		this.longitud = 8;		
		this.contrasenia = this.generarContrasenia();
	}
	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contrasenia = this.generarContrasenia();
	}
	public Password(Integer longitud, String contrasenia) {
		this.longitud = longitud;
		this.contrasenia = contrasenia;
	}
	
	public Integer getLongitud() {
		return longitud;
	}
	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasenia=" + contrasenia + ", esFuerte()=" + esFuerte() + "]";
	}
	
	// esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe 
	// tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
	
	public Boolean esFuerte() {
		int caracter;
		int contMinus = 0; int contMayus = 0; int contNum = 0;		
		
		for(int i=0; i<this.contrasenia.length(); i++) {
			caracter = (int) this.contrasenia.charAt(i);
			
			if(caracter >= 97 && caracter <= 122) {
				contMinus++;
			}else if(caracter >= 65 && caracter <= 90) {
				contMayus++;
			}else if(caracter >= 48 && caracter <= 57){
				contNum++;
			}// No agrego else por si la contraseña la genera el usuario.			
		}
		
		return ( (contMinus>1) && (contMayus>2) && (contNum>5) );
	}
	
	private String generarContrasenia() {
		String contrasenia = "";
		char caracter = ' ';
		Random rand = new Random();
		
		for(int i=0; i<this.longitud; i++) {
			switch(rand.nextInt(3)) {
				case 0: // Minuscula					
					caracter = (char) (rand.nextInt(122 - 97) + 97);					
					break;
				case 1: // Mayuscula					
					caracter = (char) (rand.nextInt(90 - 65) + 65);
					break;
				case 2: // Numero					
					caracter = (char) (rand.nextInt(57 - 48) + 48);
					break;
				default:
					break;
			}			
			
			contrasenia += caracter;
		}
		
		return contrasenia;
		
	}
	
	

}
