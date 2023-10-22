package model.entity;

import java.util.HashSet;
import java.util.Set;

public class Apartamento {
	private int numApartamento;
	private int qtdQuartos;
	private String TpOcupacao;
	private Proprietario proprietario;
	private Set<Locacao> locacao = new HashSet<>();
	private Set<CompApto> compApto = new HashSet<>();

	public int getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}

	public int getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}

	public String getTpOcupacao() {
		return TpOcupacao;
	}

	public void setTpOcupacao(String tpOcupacao) {
		TpOcupacao = tpOcupacao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Set<Locacao> getLocacao() {
		return locacao;
	}

	public void setLocacao(Set<Locacao> locacao) {
		this.locacao = locacao;
	}

	public Set<CompApto> getCompApto() {
		return compApto;
	}

	public void setCompApto(Set<CompApto> compApto) {
		this.compApto = compApto;
	}

}
