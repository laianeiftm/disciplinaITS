package org.iftm.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.iftm.entities.Avaliador;
import org.iftm.entities.Lance;
import org.iftm.entities.Leilao;
import org.iftm.entities.Usuario;
import org.junit.jupiter.api.Test;

// criando objetos usuario, leilao, e avaliador 
public class AvaliadorTest {
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;
	private Leilao leilao;
	private Avaliador avaliador;

	@BeforeEach
	public void instanciarObjetos() {
		usuario1 = new Usuario("Laiane");
		usuario2 = new Usuario("Laiane");
		usuario3 = new Usuario("Laiane");
		leilao = new Leilao("Computador Aplle");
		avaliador = new Avaliador();
	}

	@Test
	public void testarMaiorLancesSemOrdem() {
		// Criar lance

		leilao.propoe(new Lance(usuario1, 300.0));
		leilao.propoe(new Lance(usuario2, 400.0));
		leilao.propoe(new Lance(usuario3, 250.0));
		double resultadoEsperado = 400;

		// executar
		avaliador.avalia(leilao);

		// comparar
		double resultadoObtido = avaliador.getMaiorLance();
		assertEquals(resultadoEsperado, resultadoObtido, 0.0001);
	}

	@Test
	public void testarMaiorLancesOrdemCrescente() {

		// cenário: 3 lances sem ordem
		leilao.propoe(new Lance(usuario3, 250.0));
		leilao.propoe(new Lance(usuario1, 300.0));
		leilao.propoe(new Lance(usuario2, 400.0));
		double resultadoEsperado1 = 400;
		// executando a ação
		avaliador.avalia(leilao);
		// comparando a saída com o esperado
		double resultadoObtido1 = avaliador.getMaiorLance();
		assertEquals(resultadoEsperado1, resultadoObtido1, 0.0001);

	}

	@Test
	public void testarMenorLancesOrdemCrescente() {

		// cenário: 3 lances sem ordem
		leilao.propoe(new Lance(usuario3, 250.0));
		leilao.propoe(new Lance(usuario1, 300.0));
		leilao.propoe(new Lance(usuario2, 400.0));
		double resultadoEsperado = 250;
		// executando a ação
		avaliador.avalia(leilao);
		// comparando a saída com o esperado
		double resultadoObtido = avaliador.getMenorLance();
		assertEquals(resultadoEsperado, resultadoObtido, 0.0001);

	}

	@Test
	public void testarMenorLancesSemOrdem() {
		// cenário: 3 lances sem ordem
		leilao.propoe(new Lance(usuario1, 300.0));
		leilao.propoe(new Lance(usuario2, 400.0));
		leilao.propoe(new Lance(usuario3, 250.0));
		double resultadoEsperado = 250;
		// executando a ação
		avaliador.avalia(leilao);
		// comparando a saída com o esperado
		double resultadoObtido = avaliador.getMenorLance();
		assertEquals(resultadoEsperado, resultadoObtido, 0.0001);

	}

	@Test
	public void testarMenorLancesUmLance() {
		// cenário: 3 lances sem ordem
		leilao.propoe(new Lance(usuario3, 250.0));
		double resultadoEsperado = 250;
		// executando a ação
		avaliador.avalia(leilao);
		// comparando a saída com o esperado
		double resultadoObtido = avaliador.getMenorLance();
		assertEquals(resultadoEsperado, resultadoObtido, 0.0001);
	}

	@Test
	public void testarTresMaioresLancesOrdemCrescente() {
		leilao.propoe(new Lance(usuario1, 100.0));
		leilao.propoe(new Lance(usuario2, 200.0));
		leilao.propoe(new Lance(usuario1, 300.0));
		leilao.propoe(new Lance(usuario2, 400.0));
		avaliador.avalia(leilao);
		List<Lance> maiores = avaliador.getTresMaiores();
		assertEquals(3, maiores.size());
		assertEquals(400, maiores.get(0).getValor(), 0.00001);
		assertEquals(300, maiores.get(1).getValor(), 0.00001);
		assertEquals(200, maiores.get(2).getValor(), 0.00001);

	}

	@Test
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
		try {
			avaliador.avalia(leilao);
		} catch (Exception e) {
			// tudo ok;
		}
	}

}
