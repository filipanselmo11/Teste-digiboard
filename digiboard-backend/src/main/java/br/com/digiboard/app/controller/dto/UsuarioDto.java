package br.com.digiboard.app.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.digiboard.app.model.Usuario;

public class UsuarioDto {
	
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private LocalDateTime dataultimoAcesso;
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
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

	public LocalDateTime getDataultimoAcesso() {
		return dataultimoAcesso;
	}
	
	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
}
