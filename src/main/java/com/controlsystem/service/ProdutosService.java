package com.controlsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlsystem.dto.ProdutosDTO;
import com.controlsystem.mapper.ProdutosMapper;
import com.controlsystem.model.Produtos;
import com.controlsystem.repository.ProdutosRepository;

@Service
public class ProdutosService {
	
	@Autowired
	private ProdutosRepository repository;
	
	@Autowired
	private ProdutosMapper mapper;
	
	public Produtos salvar(ProdutosDTO usuario) {
		
		
		
		return new Produtos();
		
	}

	public Produtos buscar(Long id) {		
		return repository.findById(id).get();
	}

}
