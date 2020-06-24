package com.gledson.bookstoragemanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ExampleController
 * 
 * @author Gledson Oliveira
 *
 */

@RestController
@RequestMapping("/api/gledson")

public class ExemploController {

	
	@GetMapping("/servicos")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Nossos Serviços!");
	}
}
