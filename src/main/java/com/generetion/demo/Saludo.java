package com.generetion.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// aqui le damos el poder a spring de crear los objetos
// esto es inyeccion de dependencias
public class Saludo {

	@GetMapping("/")
	public String saludo() {
		return "Buenas tardesss.";
	}

	@GetMapping("/saludo")
	// datos por Get, no son datos sensibles
	public String hello(@RequestParam(value = "nombre", defaultValue = "Java") String nombre,
			@RequestParam(value = "apellidos") String apellidos) {
		return "Hellooooo mom! I'm " + nombre + " " + apellidos;
		// Como apellidos no tiene defaulValue, marca error, necesita a fuerzas el
		// valor.
		// En cambio nombre tiene default, no marca error si no le das un valor ya que
		// tiene el default
	}

	@PostMapping("/login")
	public String login(@RequestParam(value = "correo") String correo,
			@RequestParam(value = "password") String password) {
		return "Correo: " + correo + "\n" + "Password: " + password;
	}

}
