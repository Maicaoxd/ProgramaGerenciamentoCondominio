package entity;

import java.util.Date;

public class DespesaEspecifica extends DespesaFixa {
	private String descricaoDespesa;

	public void setDespesaEspecifica(String tipoDespesa, double valorDespesa, Date mesReferencia,
			String descricaoDespesa) {
		this.tipoDespesa = tipoDespesa;
		this.valorDespesa = valorDespesa;
		this.mesReferencia = mesReferencia;
		this.descricaoDespesa = descricaoDespesa;
	}

}
