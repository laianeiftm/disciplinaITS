package entities;
import entities.FuncionarioTerceirizado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTerceirizadoTeste {

	//CT01
		@Test
		public void testarConstrutorFuncnionarioComDadosValidosesalariovalido(){
			
			//Cenário de teste
		    String nomeValido = "Laiane Ribeiro";
		    double horasTrabalhadasvalida = 35.0;
		    double valorHoravalida = 50.0;
		    double salarioEsperado = 7000;
		    double despesasadicionaisvalidas = 800;
		 	Funcionario f;	
			
			//execução
			f = new Funcionario(nomeValido,horasTrabalhadasvalida,valorHoravalida, despesasadicionaisvalidas);
			double salarioObtido = f.CalcularPagamento();
			String nomeObtido = f.getNome();
		    double horastrabalhadasObtidas = f.getHorastrabalhadas();
		    double valorhorasObtidas = f.getValorhora();
		    double despesasadicionaisobtidas = f.getDespesasadicionais();
		    
		    //Comparação
		    Assertions.assertEquals(nomeValido, nomeObtido);
		    Assertions.assertEquals(horasTrabalhadasvalida, horastrabalhadasObtidas);
		    Assertions.assertEquals(valorHoravalida, valorhorasObtidas);
		    Assertions.assertEquals(salarioEsperado, salarioObtido);
		    Assertions.assertEquals(despesasadicionaisvalidas, despesasadicionaisobtidas);
		   
		}
		
		//CT02
		@Test
		public void testarConstrutorFuncionáriocomDespesasAdicionaisInvalidas() {
			//cenário de teste
			    String nomeValido = "Laiane Ribeiro";
			    double horasTrabalhadasvalida = 40.0;
			    double valorHoravalida = 40.0;
			    double salarioEsperado = 7000;
			    double despesasadicionais = 1100;
							
			//execução	
			Assertions.assertThrows(
					IllegalArgumentException.class, 
					()->{
					Funcionario f = new Funcionario(nomeValido, horasTrabalhadasvalida, valorHoravalida, despesasadicionais);
						}
					);
		}

		

}
