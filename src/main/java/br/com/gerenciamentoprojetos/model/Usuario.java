package br.com.gerenciamentoprojetos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	@Size(max=50)
	private String nome;
	
	@NonNull
	@Size(max=80)
	private String login;

	@NonNull
	@Size(max=80)
	private String senha;

	@NonNull
	@Size(max=80)
	private String CPF;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<Projeto> projetos;
	

	public List<Projeto> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Projeto> usuarios) {
		this.usuarios = usuarios;
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
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return nome + " - " + usuario + " - " + CPF;
	}

}
