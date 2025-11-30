package com.projeto.aula.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.aula.model.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario ususario =  new Usuario(1, "Maria", "maria@hotmail.com", "99109-1010", "123456");
		return ResponseEntity.ok().body(ususario);
	}
}
