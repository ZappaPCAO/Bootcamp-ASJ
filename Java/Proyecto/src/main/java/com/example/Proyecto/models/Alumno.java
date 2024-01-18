package com.example.Proyecto.models;

public class Alumno {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String nombre;
	private String apellido;
	private Double nota;
	
	public Alumno() {
		this.nombre = "";
		this.apellido = "";
		this.nota = 0.0;		
	}
	public Alumno(int id, String nombre, String apellido, Double nota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
		
}
