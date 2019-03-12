/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacaoo do arquivo: 08/03/2019
Objetivo sucinto da classe: Cria classe Papel que implementa relacionamentos com Ator e Peça
Escopo do projeto: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.gerenciateatro.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class Papel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nomePersonagem;
	private BigDecimal acrescimos;
	private Ator ator;
	private Peca peca;

	public Papel() {

	}

	public Papel(Integer ID, String nomePersonagem, BigDecimal acrescimos) {
		this.ID = ID;
		this.nomePersonagem = nomePersonagem;
		this.acrescimos = acrescimos;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public BigDecimal getAcrescimos() {
		return acrescimos;
	}

	public void setAcrescimos(BigDecimal acrescimos) {
		this.acrescimos = acrescimos;
	}

	public Ator getAtor() {
		return ator;
	}

	public void setAtor(Ator ator) {
		this.ator = ator;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
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
		Papel other = (Papel) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	public BigDecimal exibirSalarioComAcrescimos() {
		BigDecimal soma = acrescimos.add(ator.getSalario());
		return soma;

	}

}
