package com.controlsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlsystem.dto.UsuarioDTO;
import com.controlsystem.mapper.UsuarioMapper;
import com.controlsystem.model.Usuario;
import com.controlsystem.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private UsuarioMapper mapper;
	
	public Usuario salvar(UsuarioDTO usuario) {
		
		if(usuario.getSenha().equals(usuario.getConfirmar())) {
			return repository.save( mapper.converterDtoParaModel(usuario) );
		}
		
		return new Usuario();
		
	}

	public Usuario buscar(Long id) {		
		return repository.findById(id).get();
	}

}
