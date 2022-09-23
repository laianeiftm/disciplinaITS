package org.iftm.primeiroSpringBoot.entity;

public class Calculadora {
	private int resultado;

	public void somar(int num1, int num2) {
		resultado = num1 + num2;
	}

	public void subtrair(int num1, int num2) {
		resultado = num1 - num2;
	}

	public void multiplicar(int num1, int num2) {
		resultado = num1 * num2;
	}

	
	public void dividir(int num1, int num2) {
		if (num2==0)
			throw new ArithmeticException("Divisão por Zero");
		
		resultado = num1 / num2;
	}

			
	public int getResultado() {
		return resultado;
	}

}