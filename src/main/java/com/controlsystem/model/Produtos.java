package com.controlsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Produtos {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;	
	private String sabor;
	private String validade;
	private String categoria;
	private String quantidade;
	
	public Produtos() {		
		
	}	
	
	public Produtos(Long id, String sabor, String validade, String categoria, String quantidade) {		
		this.id = id;
		this.setSabor(sabor);
		this.setValidade(validade);
		this.setCategoria(categoria);
		this.setQuantidade(quantidade);
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getSabor() {
		return sabor;
	}

	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	
	public String getValidade() {
		return validade;
	}

	
	public void setValidade(String validade) {
		this.validade = validade;
	}

	
	public String getCategoria() {
		return categoria;
	}

	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	public String getQuantidade() {
		return quantidade;
	}

	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
