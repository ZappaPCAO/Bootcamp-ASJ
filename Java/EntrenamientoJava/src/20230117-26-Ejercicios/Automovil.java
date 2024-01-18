public class Automovil {
	//Atributos
	String marca;
	int anio;
	
	public Automovil(){}
	
	//Metodos
	//Modificar retorno nombre(param){ }	
	public void mostrarDatos() {
		System.out.println("Marca= " + this.marca + " - Año= " + this.anio);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}
