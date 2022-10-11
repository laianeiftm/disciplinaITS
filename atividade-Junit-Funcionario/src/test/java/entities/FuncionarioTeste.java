package entities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entities.Funcionario;

/**
 * Regras para validar o funcionário
	- O valor do pagamento dos funcionários deve ser maior ou igual ao valor atual do salário mínimo,
      que corresponde a R$ 1.212,00. No funcionário terceirizado não considere o bônus nessa analise,ou seja, é a mesma verificação do funcionário    - Os funcionários podem trabalhar por no máximo 40 horas.
    -  O valor por hora precisa ser entre 4% e 10% do salário mínimo.
    -  O valor das despesas adicionais não pode ultrapassar 1000,00.
 * @author Laiane Ribeiro 
 *
 */

public class FuncionarioTeste {
	
	//CT01
	@Test
	public void testarConstrutorFuncnionarioComDadosValidos(){
		
		//Cenário de teste
	    String nomeValido = "Laiane Ribeiro";
	    double horasTrabalhadasvalida = 35.0;
	    double valorHoravalida = 35.0;
	 	Funcionario f;	
		
		//execução
		f = new Funcionario(nomeValido,horasTrabalhadasvalida,valorHoravalida);
		String nomeObtido = f.getNome();
	    double horastrabalhadasObtidas = f.getHorastrabalhadas();
	    double valorhorasObtidas = f.getValorhora();
	    
	    //Comparação
	    Assertions.assertEquals(nomeValido, nomeObtido);
	    Assertions.assertEquals(horasTrabalhadasvalida, horastrabalhadasObtidas);
	    Assertions.assertEquals(valorHoravalida, valorhorasObtidas);
	   
	}
	
	//CT02
	@Test
	public void testarConstrutorFuncnionarioComvalorhoratrabalhadainvalida(){
		
		//Cenário de teste
	    String nomeValido = "Laiane Ribeiro";
	    double horasTrabalhadasvalida = 1.0;
	    double valorHoravalida = 35.0;
	 	Funcionario f;	
		
		//execução
		f = new Funcionario(nomeValido,horasTrabalhadasvalida,valorHoravalida);
		String nomeObtido = f.getNome();
	    double horastrabalhadasObtidas = f.getHorastrabalhadas();
	    double valorhorasObtidas = f.getValorhora();
	    
	    //Comparação
	    Assertions.assertEquals(nomeValido, nomeObtido);
	    Assertions.assertEquals(horasTrabalhadasvalida, horastrabalhadasObtidas);
	    Assertions.assertEquals(valorHoravalida, valorhorasObtidas);
	   
	}
}
