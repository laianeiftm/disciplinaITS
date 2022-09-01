package org.iftm.entities;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Leilao {
	
	private String nome;
	private Double valorInicial = 0.0;
	private Usuario usuario;
	private Calendar dataAbertura;
	private boolean usado;
	
	private List<Lance> lances;

	public Leilao(String nome) {
		this.nome = nome;
		lances = new ArrayList<Lance>();
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	public Double getValorInicial() {
		return valorInicial;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public void propoe(Lance lance) {
		lances.add(lance);		
	}

}
