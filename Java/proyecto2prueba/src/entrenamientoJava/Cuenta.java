package entrenamientoJava;

public class Cuenta {
	private String titular;
	private Double cantidad;
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	public Cuenta(String titular, Double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {		
		this.titular = titular;
	}
	public Double getCantidad() {		
		return cantidad;
	}
	public void setCantidad(Double cantidad) {		
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void ingresar(Double cantidad) {
		if(cantidad >= 0) {
			this.cantidad += cantidad;
		}		
	}
	
	public void retirar(Double cantidad) {
		if( (this.cantidad - cantidad) < 0 ) {
			this.cantidad =  0.0;
		}else {
			this.cantidad -= cantidad; 
		}
	}
	
	
	
}
