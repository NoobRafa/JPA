package com.jpa.orm.aula01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue; // auto incrementar
import javax.persistence.Id;// Chave-primária
@Entity // Assinatura que permite a comunicação entre OO e modelo relacional
public class Livro {
	
	@Id @GeneratedValue
	private long id;
	
	private String titulo;
	private String ano_publicacao;
	private String autor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(String ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro [id = " + id + ", titulo = " + titulo + ", ano_publicacao = "
				+ ano_publicacao + ", autor = " + autor + "]";
	}
	
	
}
