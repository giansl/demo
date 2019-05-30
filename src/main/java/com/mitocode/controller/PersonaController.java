package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.service.IPersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	/*public PersonaController() {
		service = new PersonaServiceImpl();
	}*/
	
	@GetMapping
	public void mostrar(){
		service.guardar();
	}
}
