package com.generetion.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	
	
	
@GetMapping("/")
	public String saludo() {
		return "Buenas tardes.";
	}

@GetMapping("/saludo")
	public String hello(@RequestParam(value="nombre", 
	defaultValue = "Java") String nombre) {
		return "Hello mom! I'm " + nombre;
	}

}
