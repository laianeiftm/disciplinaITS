package entities;

public class Funcionario {
	public static final int VALORMAXIMO_DESPESAS = 1000;
	public static final double VALORMAXIMO_HORASTRABALHADAS = 40.0;
	public static final double LIMITE_INFERIOR_VALORPORHORA = 48.48;
	public static final double LIMITE_SUPERIOR_VALORPORHORA = 121.20;
	private String nome;
	private double horastrabalhadas;
	private double valorhora;

	
	public Funcionario (String nome, double horastrabalhadas, double valorhora) {
			if (horastrabalhadas > VALORMAXIMO_HORASTRABALHADAS) {
				throw new IllegalArgumentException("O Valor máximo de horas trabalhadas é 40");
				}
			if (valorhora < LIMITE_INFERIOR_VALORPORHORA || valorhora > LIMITE_SUPERIOR_VALORPORHORA) {
				throw new IllegalArgumentException("O valor por hora precisa ser entre 4% e 10% do salário mínimo");
			}
		this.nome = nome;
		this.horastrabalhadas = horastrabalhadas;
		this.valorhora = valorhora;
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
	public double CalcularPagamento() {
		double salario=(horastrabalhadas * valorhora *4 );
		if (salario < 1212.00) {
			throw new IllegalArgumentException("O Valor do salario est abaixo de um salario minimo");
			}
	    return (salario);
	}


}
