package entrenamientoJava;
/*
1) Cree una clase que me permita realizar una operación matemática de 2 números.
 	(Crear los metodos y atributos necesarios)
*/
public class Ejercicio_1 {
	
	private double num_a, num_b;
	
	public Ejercicio_1(double a, double b){
		this.num_a = a;
		this.num_b = b;
	}

	public double getNum_a() {
		return num_a;
	}

	public void setNum_a(double num_a) {
		this.num_a = num_a;
	}

	public double getNum_b() {
		return num_b;
	}

	public void setNum_b(double num_b) {
		this.num_b = num_b;
	}
	
	public double sumar() {
		return (this.num_a + this.num_b);
	}
	
	public double restar() {
		return (this.num_a - this.num_b);
	}
	
	public double multiplicar() {
		return (this.num_a * this.num_b);
	}
	
	public double dividir() {
		
		if(num_b == 0) {
			System.out.println("No se puede dividir por 0 !!");
			return 0;
		}
		
		return (this.num_a / this.num_b);
	}
	
}
