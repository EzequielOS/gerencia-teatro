/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacaoo do arquivo: 12/03/2019
Objetivo sucinto da classe: Cria classe Peca que implementa relacionamento com Papel
Escopo do projeto: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.gerenciateatro.dominio;

import java.io.Serializable;
import java.util.Date;

public class Peca implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String titulo;
	private Integer duracao;
	private Date data;

	public Peca() {
		
	}
	
	public Peca(Integer iD, String titulo, Integer duracao, Date data) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.duracao = duracao;
		this.data = data;
	}

	public Integer getID() {
		return ID;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
