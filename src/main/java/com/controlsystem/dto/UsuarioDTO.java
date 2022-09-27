package com.controlsystem.dto;

public class UsuarioDTO {

	private Long id;	
	private String email;
	private String usuario;
	private String senha;
	private String confirmar;
	
	public UsuarioDTO() {
	
	}
	
	public UsuarioDTO(Long id, String email, String usuario, String senha, String confirmar) {
		this.id = id;
		this.email = email;
		this.usuario = usuario;
		this.senha = senha;
		this.confirmar = confirmar;
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
	public String getConfirmar() {
		return confirmar;
	}
	public void setConfirmar(String confirmar) {
		this.confirmar = confirmar;
	}
	
	
	
}
