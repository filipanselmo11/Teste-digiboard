package br.com.digiboard.app.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String login;
	
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private Status ativo = Status.Ativo;
	
	private LocalDateTime dataultimoAcesso = LocalDateTime.now();
	
	public Usuario() {}

	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime + result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Status getAtivo() {
		return ativo;
	}

	public void setAtivo(Status ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataultimoAcesso() {
		return dataultimoAcesso;
	}

	public void setDataultimoAcesso(LocalDateTime dataultimoAcesso) {
		this.dataultimoAcesso = dataultimoAcesso;
	}
	
	
	
	
	
	
	
	
}
