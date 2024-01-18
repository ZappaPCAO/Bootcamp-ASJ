package com.example.Proyecto.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.example.Proyecto.models.Alumno;

import jakarta.websocket.server.PathParam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AlumnoController {
	
	//Variable --> alumnos
	List<Alumno> alumnos = new ArrayList<Alumno>(
			List.of(
				new Alumno(1, "Bob", "Patiño", 9.5),
				new Alumno(2, "Moe", "Scyslak", 4.0),
				new Alumno(3, "Troy", "Mclure", 2.6),
				new Alumno(4, "Edna", "Krabaples", 8.7)
			)
		);
	
	@GetMapping("/alumnos")
	public List<Alumno> getListPersonas() {
		return this.alumnos;
	}
	
	@GetMapping("/alumnos/{id}")
	public Alumno getAlumnoById(@PathVariable int id) {
		Alumno retAlu = null;
		for(Alumno al : this.alumnos) {
			if(al.getId() == id) {
				retAlu = al;
			}
		}
		
		return retAlu;
	}
	
	@DeleteMapping("/alumnos/{id}")
	public String deleteAlumno(@PathVariable int id) {
		Alumno alumnoDelete = this.getAlumnoById(id);
		
		if(this.alumnos.contains(alumnoDelete)) {			
			this.alumnos.remove(alumnoDelete);
		}
		
		return ((alumnoDelete == null) ? "El id no corresponde con ningun alumno." :
										 "Alumno " + id + " eliminado correctamente!");
	}
	
	@PostMapping("/alumnos/{name}-{lastname}-{note}")
	public String postAlumno(@PathVariable String name, @PathVariable String lastname, @PathVariable Double note) {
		
		Alumno alumnoAux = new Alumno(
				this.alumnos.getLast().getId()+1,
				name, lastname, note
				);
		
		this.alumnos.add(alumnoAux);
		
		return ((alumnoAux == null) ? "No fue posible agregar el alumno." :
			 "Alumno " + alumnoAux.getId() + " agregado correctamente!");
	}
	
	@PutMapping("path/{id}-{name}-{lastname}-{note}")
	public String putMethodName(@PathVariable int id, @PathVariable String name, @PathVariable String lastname, @PathVariable Double note) {
		
		
		return entity;
	}
}
