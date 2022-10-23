package entities;

public class FuncionarioTerceirizado extends Funcionario {

	public FuncionarioTerceirizado(String nome, double horastrabalhadas, double valorhora) {
		super(nome, horastrabalhadas, valorhora);
		}
	double despesasadicionais;
	public static final double VALORMAXIMO_DESPESASADICIONAIS = 1000.0;
	
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

}
