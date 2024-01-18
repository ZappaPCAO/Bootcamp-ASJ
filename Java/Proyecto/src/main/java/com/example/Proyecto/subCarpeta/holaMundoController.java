package com.example.Proyecto.subCarpeta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class holaMundoController {
	
	/*
	El controlador entiende las peticiones que hace un cliente.
	Significa que necesitamos:
			-URL
			-Metodo
			-Datos(opcional)
	*/
	
	@GetMapping("/saludo") //localhost:8080/saludo [GET]
	public String holaMundo() {
		return "Hola Mundo! Estamos probando Spring Boot :')";
	}

	@GetMapping("/saludo/{name}")
	public String getMethodName(@PathVariable String name) {
		return "Hola " + name + "! Estamos probando :')";
	}
	
}

/*
 SPRING BOOT

  - CONTROLLERS = Maneja la peticion de la API.
  - SERVICES = Logica de negocio.
  - REPOSITORIES = Permite hacer consultas a la BD.
  - MODELS = Representación de la estructura de una entidad.

*/
