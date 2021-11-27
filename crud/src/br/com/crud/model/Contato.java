package br.com.crud.model;

import java.sql.Date;

public class Contato {

	private int id;
	private String name;
	private int idade;
	private Date dataCadastro;
	
	public int getId() {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public String getNome() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Date getdataCadastro() {
		return dataCadastro;
	}
	
	public void setdataCadastro(Date dataCadastro) {
	this.dataCadastro = dataCadastro;
	}
	
}
