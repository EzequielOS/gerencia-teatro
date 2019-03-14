/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacaoo do arquivo: 14/03/2019
Objetivo sucinto da classe: Cria classe teste da classe Papel
Escopo do projeto: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
package br.com.sankhya.gerenciateatro.teste;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.sankhya.gerenciateatro.dominio.Ator;
import br.com.sankhya.gerenciateatro.dominio.Papel;

public class PapelTeste {
	Papel diretor = new Papel();
	Papel paiAluno = new Papel();
	Ator meweni = new Ator();
	
	@Before
	public void instaciacoes() {
		meweni.setSalario(new BigDecimal(2500));
		diretor.setAcrescimos(new BigDecimal(110));
		paiAluno.setAcrescimos(new BigDecimal(230));
	
		diretor.setAtor(meweni);
		paiAluno.setAtor(meweni);
		meweni.getPapeis().addAll(Arrays.asList(diretor, paiAluno));
	}
	
	@Test
	public void testSalarioAcrescimos() {
	
		assertEquals(new BigDecimal(2610), diretor.exibirSalarioComAcrescimos());
		assertEquals(new BigDecimal(2730), paiAluno.exibirSalarioComAcrescimos());
		

	}

}
