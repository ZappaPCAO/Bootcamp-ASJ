package entrenamientoJava;

public class Ejecutable {
	private String contrasenia;
	private String esFuerte;
	
	public Ejecutable(String contrasenia, Boolean esFuerte){
		this.contrasenia = contrasenia;
		this.esFuerte = ( esFuerte ) ? "FUERTE" : "DEBIL";
		
		this.toString();
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getEsFuerte() {
		return esFuerte;
	}

	public void setEsFuerte(String esFuerte) {
		this.esFuerte = esFuerte;
	}

	@Override
	public String toString() {
		return "Ejecutable [contrasenia=" + this.contrasenia + ", esFuerte=" + this.esFuerte + "]";
	}
}
