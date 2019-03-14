/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacaoo do arquivo: 14/03/2019
Objetivo sucinto da classe: Cria classe teste da classe Peca
Escopo do projeto: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
package br.com.sankhya.gerenciateatro.teste;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.sankhya.gerenciateatro.dominio.Ator;
import br.com.sankhya.gerenciateatro.dominio.Papel;
import br.com.sankhya.gerenciateatro.dominio.Peca;

public class PecaTeste {

	static Peca cidade = new Peca();
	static Peca escolinha = new Peca();
	static Papel diretor = new Papel();
	static Papel paiAluno = new Papel();
	static Ator meweni = new Ator();

	@BeforeClass
	public static void instaciacoes() {
		meweni.setSalario(new BigDecimal(2500));
		diretor.setAcrescimos(new BigDecimal(110));
		paiAluno.setAcrescimos(new BigDecimal(310));

		diretor.setAtor(meweni);
		paiAluno.setAtor(meweni);
		meweni.getPapeis().addAll(Arrays.asList(diretor, paiAluno));

		cidade.getPapeis().addAll(Arrays.asList(diretor));
		escolinha.getPapeis().addAll(Arrays.asList(paiAluno));
	}

	@Test
	public void testCustoTotal() {
		assertEquals(new BigDecimal(2610), cidade.exibirCustoTotal());
		assertEquals(new BigDecimal(2810), escolinha.exibirCustoTotal());
	}

}
