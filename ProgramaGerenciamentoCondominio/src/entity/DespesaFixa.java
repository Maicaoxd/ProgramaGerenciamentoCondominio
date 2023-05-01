package entity;

import java.util.Date;

public class DespesaFixa {
	protected String tipoDespesa;
	protected double valorDespesa;
	protected Date mesReferencia;

	public void setDespesaFixa(String tipoDespesa, double valorDespesa, Date mesReferencia) {
		this.tipoDespesa = tipoDespesa;
		this.valorDespesa = valorDespesa;
		this.mesReferencia = mesReferencia;
	}

}
