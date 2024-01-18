package entrenamientoJava;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : 'H';
    }

    private String generarDNI() {
        Random rand = new Random();
        // Generar un número aleatorio de 8 cifras
        int numero = rand.nextInt(90000000) + 10000000;
        return Integer.toString(numero);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI +
                "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
