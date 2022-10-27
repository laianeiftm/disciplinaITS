package entities;

public class FuncionarioTerceirizado extends Funcionario {
	public static final double VALORMAXIMO_DESPESASADICIONAIS = 1000.0;
	double despesasadicionais;

	public FuncionarioTerceirizado(String nome, double horastrabalhadas, double valorhora, double despesasadicionais) {
		super(nome, horastrabalhadas, valorhora);
		this.despesasadicionais = validadespesasadicionais(despesasadicionais); 
	}

	public double getDespesasadicionais() {
		return despesasadicionais;
	}

	public void setDespesasadicionais(double despesasadicionais) {
		this.despesasadicionais = validadespesasadicionais(despesasadicionais);
	}

	public static double validadespesasadicionais(double despesasadicionais) {
		if (despesasadicionais > VALORMAXIMO_DESPESASADICIONAIS) {
			throw new IllegalArgumentException("O Valor máximo de despesas adicionais é 1000");
		}
		return despesasadicionais;
	}

	@Override
	public double CalcularPagamento() {
		// TODO Auto-generated method stub
		return super.CalcularPagamento() + (despesasadicionais*1.1);
	}
	
	

}
