package com.controlsystem.mapper;

import org.springframework.stereotype.Component;

import com.controlsystem.dto.UsuarioDTO;
import com.controlsystem.model.Usuario;

@Component
public class UsuarioMapper {

	public Usuario converterDtoParaModel(UsuarioDTO dto) {
		
		Usuario model = new Usuario();
		
		model.setId(dto.getId());
		model.setEmail(dto.getEmail());
		model.setSenha(dto.getSenha());
		model.setUsuario(dto.getUsuario());
		
		return model;
	}
}
