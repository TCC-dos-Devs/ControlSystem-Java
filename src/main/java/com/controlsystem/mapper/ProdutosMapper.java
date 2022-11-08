package com.controlsystem.mapper;

import org.springframework.stereotype.Component;

import com.controlsystem.dto.ProdutosDTO;
import com.controlsystem.model.Produtos;

@Component
public class ProdutosMapper {

	public Produtos converterDtoParaModel(ProdutosDTO dto) {
		
		Produtos model = new Produtos();
		
		
		return model;
	}
}
