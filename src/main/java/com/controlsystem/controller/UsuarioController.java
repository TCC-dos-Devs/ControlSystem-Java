package com.controlsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controlsystem.dto.UsuarioDTO;
import com.controlsystem.model.Usuario;
import com.controlsystem.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public Usuario salvar(@RequestBody UsuarioDTO usuario) {
		return service.salvar(usuario);
	}
	
	@GetMapping(value = "/{id}")
	public Usuario buscar(@PathVariable Long id) {
		return service.buscar(id);
	}
	
}
