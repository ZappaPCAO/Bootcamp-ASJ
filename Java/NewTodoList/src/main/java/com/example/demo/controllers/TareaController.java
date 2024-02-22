package com.example.demo.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ErrorHandler;
import com.example.demo.models.TareaModel;
import com.example.demo.services.TareaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tareas") // localhost:8080/tareas
public class TareaController {
	
	@Autowired
	TareaService tareaService;
	
	@GetMapping("/test")
	public ResponseEntity<String> testing() {
		return ResponseEntity.ok("Funca");
	}
	
	@GetMapping // [GET] localhost:8080/tareas
	public ResponseEntity<List<TareaModel>> getTareas() {		
		return ResponseEntity.ok( this.tareaService.obtenerTareas() );
	}
	
	@GetMapping("/{id}") // [GET] localhost:8080/tareas/3
	public ResponseEntity<Optional<TareaModel>> getTareaById(@PathVariable Integer id) {
		return ResponseEntity.ok(this.tareaService.obtenerTareaById(id));
	}
	
	@PostMapping() // [POST] localhost:8080/tareas
	public ResponseEntity<Object> createTarea(@Valid @RequestBody TareaModel tarea, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			Map<String, String> errors = new ErrorHandler().inputValidate(bindingResult);
			
			System.out.println(errors);
			
			return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
		}		
		return new ResponseEntity<>(this.tareaService.crearTarea(tarea), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Optional<TareaModel>> updateTarea(@PathVariable int id, @RequestBody TareaModel tarea) {
		return ResponseEntity.ok(this.tareaService.modificarTarea(id, tarea));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Optional<Boolean>> updateTarea(@PathVariable int id) {
		return ResponseEntity.ok(this.tareaService.eliminarTarea(id));
	}
	
}
