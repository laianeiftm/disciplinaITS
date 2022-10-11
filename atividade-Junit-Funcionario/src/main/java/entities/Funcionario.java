package entities;

public class Funcionario {
	public static final int VALORMAXIMO_DESPESAS = 1000;
	public static final double VALORMAXIMO_HORASTRABALHADAS = 40.0;
	//public static final int LIMITE_INFERIOR_VALORPORHORA = valorhora/4*100;
	private String nome;
	private double horastrabalhadas;
	private double valorhora;

	
	public Funcionario (String nome, double horastrabalhadas, double valorHora) {
		this.nome = nome;
		this.horastrabalhadas = horastrabalhadas;
		this.valorhora = valorHora;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getHorastrabalhadas() {
		return horastrabalhadas;
	}


	public void setHorastrabalhadas(double horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}


	public double getValorhora() {
		return valorhora;
	}


	public void setValorhora(int valorhora) {
		this.valorhora = valorhora;
	}
	
	// public boolean estaAprovado() {
	//	return (valor < NOTA_MINIMA || frequencia < FREQUENCIA_MINIMA ? false : true);
	//}


}
