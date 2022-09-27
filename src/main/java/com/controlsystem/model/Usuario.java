package com.controlsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;	
	@Column(name = "email")
	private String email;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "senha")
	private String senha;
	
	public Usuario() {		
		
	}	
	
	public Usuario(Long id, String email, String usuario, String senha) {		
		this.id = id;
		this.email = email;
		this.usuario = usuario;
		this.senha = senha;
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
