package model.entity;

import java.util.HashSet;
import java.util.Set;

public class Morador {

	private String nome;
	private Set<Locacao> locacao = new HashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Locacao> getLocacao() {
		return locacao;
	}

	public void setLocacao(Set<Locacao> locacao) {
		this.locacao = locacao;
	}
}
