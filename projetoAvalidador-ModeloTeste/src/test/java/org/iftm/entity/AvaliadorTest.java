package org.iftm.entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.iftm.entities.Avaliador;
import org.iftm.entities.Lance;
import org.iftm.entities.Leilao;
import org.iftm.entities.Usuario;
import org.junit.jupiter.api.Test;

// criando objetos usuario, leilao, e avaliador 
public class AvaliadorTest{
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;
	private Leilao leilao;
	private Avaliador avaliador;
	
	@Test
	public void meuPrimeiroTeste() {
		usuario1 = new Usuario("Laiane");
		usuario2 = new Usuario("Laiane");
		usuario3 = new Usuario("Laiane");
		leilao = new Leilao("Computador Aplle");
		avaliador = new Avaliador ();	
		
		// Criar lance
		
		leilao.propoe(new Lance(usuario1,300.0));
		leilao.propoe(new Lance(usuario2,400.0));
		leilao.propoe(new Lance(usuario3,250.0));
		double resultadoEsperado = 400;
		
		// executar
		avaliador.avalia(leilao);
		
		// comparar
		double resultadoObtido = avaliador.getMaiorLance();
		assertEquals(resultadoEsperado, resultadoObtido, 0.0001);
		

		
  
	}

}
