package br.com.digiboard.app.controller.form;

import com.sun.istack.NotNull;

import br.com.digiboard.app.model.Usuario;
import br.com.digiboard.app.repository.UsuarioRepository;

public class UsuarioForm {
	
	@NotNull
	private String nome;
	@NotNull
	private String login;
	@NotNull
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario converter(UsuarioRepository usuarioRepository) {
		return null;
	}
	
	
}
