package model.entity;

public class Locacao {

	Morador morador;
	Apartamento apartamento;

	public Locacao(Morador morador, Apartamento apartamento) {
		this.morador = morador;
		this.apartamento = apartamento;
	}

}
