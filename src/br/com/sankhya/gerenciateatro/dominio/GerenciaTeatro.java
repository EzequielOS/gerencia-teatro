/*
Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacaoo do arquivo: 12/03/2019
Objetivo sucinto da classe: Cria classe main do projeto Gerenciador de Teatro
Escopo do projeto: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*
*new Date(data1.getTime() - (1728 * 100000000)
*/
package br.com.sankhya.gerenciateatro.dominio;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class GerenciaTeatro {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = formato.parse("23/11/2015");
		Date data2 = formato.parse("25/09/2018");
		
		Ator daCosta = new Ator(1, "Marco da Costa", "BR", new BigDecimal("1500"));
		Ator meweni = new Ator(2, "Josh Meweni", "EUA", new BigDecimal("2500"));
		Ator delavgne = new Ator(3, "Laura Delavgne", "UK", new BigDecimal("1300"));
		Ator arruda = new Ator(4, "Maria Arruda", "BR", new BigDecimal("1500"));

		Papel faxineira = new Papel(11, "Tia Odete", new BigDecimal("230"));
		Papel diretor = new Papel(12, "Larry Stilinsky", new BigDecimal("110"));
		Papel aluno = new Papel(13, "Joaozinho", new BigDecimal("310"));
		Papel professora = new Papel(14, "Vania", new BigDecimal("150"));
		Papel paiAluno = new Papel(15, "Sr. Raimundo", new BigDecimal("230"));

		Peca escolinha = new Peca(21, "Escolinha do Joao", 130, data1);
		Peca cidade = new Peca(22, "Larryng City: A cidade de 5 habitantes", 165, data2);

		daCosta.getPapeis().addAll(Arrays.asList(aluno));
		meweni.getPapeis().addAll(Arrays.asList(paiAluno, diretor));
		delavgne.getPapeis().addAll(Arrays.asList(faxineira));
		arruda.getPapeis().addAll(Arrays.asList(professora));

		aluno.setAtor(daCosta);
		paiAluno.setAtor(meweni);
		diretor.setAtor(meweni);
		faxineira.setAtor(delavgne);
		professora.setAtor(arruda);

		escolinha.getPapeis().addAll(Arrays.asList(aluno, paiAluno, diretor, faxineira, professora));
		cidade.getPapeis().addAll(Arrays.asList(aluno, paiAluno, diretor, faxineira, professora));
		
		System.out.println(escolinha);
		System.out.println(diretor);
		System.out.println(meweni);
		System.out.println("Salario com acrescimos: " + diretor.exibirSalarioComAcrescimos());
		
	}
}
