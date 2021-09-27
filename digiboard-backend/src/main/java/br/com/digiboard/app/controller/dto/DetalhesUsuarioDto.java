package br.com.digiboard.app.controller.dto;

import java.time.LocalDateTime;

import br.com.digiboard.app.model.Status;
import br.com.digiboard.app.model.Usuario;

public class DetalhesUsuarioDto {
	
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private Status ativo;
	private LocalDateTime dataultimoAcesso;
	
	public DetalhesUsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
		this.ativo = usuario.getAtivo();
		this.dataultimoAcesso = usuario.getDataultimoAcesso();
		
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Status getAtivo() {
		return ativo;
	}

	public LocalDateTime getDataultimoAcesso() {
		return dataultimoAcesso;
	}
	
	
}
