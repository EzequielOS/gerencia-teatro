/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacaoo do arquivo: 08/03/2019
Objetivo sucinto da classe: Cria classe Ator que implementa relacionamento com Papel
Escopo do projeto: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.gerenciateatro.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ator implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nome;
	private String nacionalidade;
	private BigDecimal salario;
	private List<Papel> papeis = new ArrayList<>();

	public Ator() {

	}

	public Ator(Integer ID, String nome, String nacionalidade, BigDecimal salario) {
		this.ID = ID;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.salario = salario;
	}

	public Integer getID() {
		return ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
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
		Ator other = (Ator) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ator [ID=" + ID + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", salario=" + salario
				+ "]";
	}
}
