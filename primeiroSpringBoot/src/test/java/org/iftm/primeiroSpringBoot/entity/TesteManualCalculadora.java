package org.iftm.primeiroSpringBoot.entity;

import org.iftm.primeiroSpringBoot.entity.Calculadora;

public class TesteManualCalculadora {

	public static void main(String[] args) {
		//1. parte: definir cenário de teste
		//instanciar os objetos a serem testado
		Calculadora calculadora = new Calculadora();
		//definir as variáveis de entrada e resultado esperado
		//entradas necessárias para o teste
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		//saída esperada do teste
		int resultadoEsperado = 15;
		//2. parte: executar a função a ser testada
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		//3. parte: verificar o resultado
		if (resultadoEsperado == resultadoObtido) {
			System.out.println("Passou no teste");
		}else {
			System.out.println("Não passou no teste");
		}
	}

}