package br.senac.tads.dsw.exemplossala.models;

import java.time.LocalDate;

public class DadosPessoais {

	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String linkedIn;
	private String github;

	public DadosPessoais() {
	}

	public DadosPessoais(String nome, String email, LocalDate dataNascimento, String linkedIn, String github) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.linkedIn = linkedIn;
		this.github = github;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

}
