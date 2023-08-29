package com.itb.EatNow.FastFood.model;

import javax.persistence.Entity;

@Entity
public class Pessoa {

	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String logradouro;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	
	private boolean codStatusPessoa;
	
	// Setter's e Getter

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public boolean getCodStatusPessoa() {
		return codStatusPessoa;
	}

	public void setCodStatusPessoa(boolean codStatusPessoa) {
		this.codStatusPessoa = codStatusPessoa;
	}
	
	
	
}
