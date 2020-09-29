package br.com.gerenciamentoprojetos.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

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
	@Size(max=11)
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NonNull
	public String getNome() {
		return nome;
	}

	public void setNome(@NonNull String nome) {
		this.nome = nome;
	}

	@NonNull
	public String getLogin() {
		return login;
	}

	public void setLogin(@NonNull String login) {
		this.login = login;
	}

	@NonNull
	public String getSenha() {
		return senha;
	}

	public void setSenha(@NonNull String senha) {
		this.senha = senha;
	}

	@NonNull
	public String getCpf() {
		return cpf;
	}

	public void setCpf(@NonNull String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"nome='" + nome + '\'' +
				'}';
	}
}
