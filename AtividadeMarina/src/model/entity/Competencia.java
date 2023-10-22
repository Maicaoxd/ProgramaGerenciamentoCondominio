package model.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Competencia {
	private int mes;
	private int ano;
	private List<Despesa> despesas = new ArrayList<>();
	private Set<CompApto> compApto = new HashSet<>();

	public Set<CompApto> getCompApto() {
		return compApto;
	}

	public void setCompApto(Set<CompApto> compApto) {
		this.compApto = compApto;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}

	public double calcularTotalDespesas() {
		double total = 0;
		for (Despesa despesa : despesas) {
			total += despesa.getValor();
		}
		return total;
	}
}
