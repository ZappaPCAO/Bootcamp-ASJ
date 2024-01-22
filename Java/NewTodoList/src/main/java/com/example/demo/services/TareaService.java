package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.TareaModel;
import com.example.demo.repositories.TareaRepository;

@Service
public class TareaService {
	
	//Inteccion de dependencia (conecta)
	@Autowired
	TareaRepository tareaRepository;
	
	// obtener tareas
	public List<TareaModel> obtenerTareas(){
		return this.tareaRepository.findAll(); // find all -> select * from tareas;
	}
	
	// obtener tarea segun id
	public Optional<TareaModel> obtenerTareaById(Integer id) {
		return this.tareaRepository.findById(id);
	}
	
	// insertar tarea
	public Optional<TareaModel> crearTarea(TareaModel tarea){
		this.tareaRepository.save(tarea);
		return Optional.ofNullable(tarea);
	}
	
	// modificar tarea
	public Optional<TareaModel> modificarTarea(Integer id, TareaModel tarea){
		TareaModel aux = this.tareaRepository.findById(id).get();
		
		if(aux != null) {
			this.tareaRepository.save(tarea);			
		}
		
		return Optional.ofNullable(tarea);
	}
	
	// eliminar tarea	
	public Optional<Boolean> eliminarTarea(Integer id) {
		this.tareaRepository.deleteById(id);
		return Optional.of(true);
//		try{
//			eliminar
//			retorno ok
//		}catch(Exception error) {
//			return error
//		}
	}
}
