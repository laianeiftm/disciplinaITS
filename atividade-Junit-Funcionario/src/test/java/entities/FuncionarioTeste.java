package entities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entities.Funcionario;

/**
 * Regras para validar o funcionário
	- O valor do pagamento dos funcionários deve ser maior ou igual ao valor atual do salário mínimo,
      que corresponde a R$ 1.212,00. No funcionário terceirizado não considere o bônus nessa analise,ou seja, é a mesma verificação do funcionário   
    - Os funcionários podem trabalhar por no máximo 40 horas.
    -  O valor por hora precisa ser entre 4% e 10% do salário mínimo.
    -  opcional O valor das despesas adicionais não pode ultrapassar 1000,00.
 * @author Laiane Ribeiro 
 *
 */

public class FuncionarioTeste {
	
	//CT01
	@Test
	public void testarConstrutorFuncnionarioComDadosValidosesalariovalido(){
		
		//Cenário de teste
	    String nomeValido = "Laiane Ribeiro";
	    double horasTrabalhadasvalida = 35.0;
	    double valorHoravalida = 50.0;
	    double salarioEsperado = 7000;
	 	Funcionario f;	
		
		//execução
		f = new Funcionario(nomeValido,horasTrabalhadasvalida,valorHoravalida);
		double salarioObtido = f.CalcularPagamento();
		String nomeObtido = f.getNome();
	    double horastrabalhadasObtidas = f.getHorastrabalhadas();
	    double valorhorasObtidas = f.getValorhora();
	    
	    //Comparação
	    Assertions.assertEquals(nomeValido, nomeObtido);
	    Assertions.assertEquals(horasTrabalhadasvalida, horastrabalhadasObtidas);
	    Assertions.assertEquals(valorHoravalida, valorhorasObtidas);
	    Assertions.assertEquals(salarioEsperado, salarioObtido);
	   
	}
	
	
	//CT02
	@Test
	public void testarConstrutorFuncionáriocomHorasTrabalhadasInvalidasmenorquequatroporcento() {
		//cenário de teste
		    String nomeValido = "Laiane Ribeiro";
		    double horasTrabalhadasvalida = 40.0;
		    double valorHorainvalida = 20.0;
		    double salarioEsperado = 7000;
						
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
				Funcionario f = new Funcionario(nomeValido, horasTrabalhadasvalida, valorHorainvalida);
					}
				);
	}

	//CT03
	@Test
	public void testarConstrutorFuncionáriocomHorasTrabalhadasInvalidasmaiorquedezporcento() {
		//cenário de teste
		    String nomeValido = "Laiane Ribeiro";
		    double horasTrabalhadasvalida = 40.0;
		    double valorHorainvalida = 150.0;
		    double salarioEsperado = 7000;
						
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
				Funcionario f = new Funcionario(nomeValido, horasTrabalhadasvalida, valorHorainvalida);
					}
				);
	}

	
//CT04
	@Test
	public void testarConstrutorFuncionáriocomValorHoraInvalidasMaiorqueQuarentaHoras() {
		//cenário de teste
		    String nomeValido = "Laiane Ribeiro";
		    double horasTrabalhadasinvalida = 50.0;
		    double valorHoravalida = 50.0;
		    double salarioEsperado = 7000;
						
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
				Funcionario f = new Funcionario(nomeValido, horasTrabalhadasinvalida, valorHoravalida);
					}
				);
	}

	
    //CT05 
     @Test
  public void testarConstrutorFuncionáriocomdadosvalidosesalarioinvalido() {
	//cenário de teste
	   String nomeValido = "Laiane Ribeiro";
	    double horasTrabalhadasvalida = 30.0;
	    double valorHoravalida = 10.0;
	    double salarioEsperado = 1200;
					
	//execução	
	Assertions.assertThrows(
			IllegalArgumentException.class, 
			()->{
			Funcionario f = new Funcionario(nomeValido, horasTrabalhadasvalida, valorHoravalida);
				}
			);
 }
     
   //CT06
 	@Test
 	public void testarModificarFuncionáriocomValorHoraInvalidasMaiorqueQuarentaHoras() {
 		//cenário de teste
 	    String nomeValido = "Laiane Ribeiro";
	    double horasTrabalhadasvalida = 35.0;
	    double valorHoravalida = 50.0;
	    double salarioEsperado = 7000;
	 	Funcionario f = new	Funcionario(nomeValido, horasTrabalhadasvalida, valorHoravalida);
	 	
 		//execução	
	    double valorHorainvalida = 150.0;
 		Assertions.assertThrows(
 				IllegalArgumentException.class, 
 				()->{
 				f.setValorhora(valorHorainvalida);
 					}
 				);
 	}

       
    //CT07
  	@Test
  	public void testarModificarFuncionáriocomHorastrabalhadasinvalidasmaiorquedezporcento() {
  		//cenário de teste
  	    String nomeValido = "Laiane Ribeiro";
 	    double horasTrabalhadasvalida = 35.0;
 	    double valorHoravalida = 50.0;
 	    double salarioEsperado = 7000;
 	 	Funcionario f = new	Funcionario(nomeValido, horasTrabalhadasvalida, valorHoravalida);
 	 	
  		//execução	
 	    double horastrabalhadasinvalidas = 50.0;
  		Assertions.assertThrows(
  				IllegalArgumentException.class, 
  				()->{
  				f.setHorastrabalhadas(horastrabalhadasinvalidas);
  					}
  				);
  	}

    //CT08
  	@Test
  	public void testarModificarFuncionáriocomHorastrabalhadasinvalidasmenorquequatroporcento() {
  		//cenário de teste
  	    String nomeValido = "Laiane Ribeiro";
 	    double horasTrabalhadasvalida = 35.0;
 	    double valorHoravalida = 50.0;
 	    double salarioEsperado = 7000;
 	 	Funcionario f = new	Funcionario(nomeValido, horasTrabalhadasvalida, valorHoravalida);
 	 	
  		//execução	
 	    double valorhorainvalida = 20.0;
  		Assertions.assertThrows(
  				IllegalArgumentException.class, 
  				()->{
  				f.setValorhora(valorhorainvalida);
  					}
  				);
  	}       
     
      
     
     
     
     
}



