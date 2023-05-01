package entity;

public class Apartamento {
	private String numeroApartamento;
	private int qtdQuartos;
	private String tipoOcupacao;
	private Proprietario proprietario;

	public void setApartamento(String numeroApartamento, int qtdQuartos, String tipoOcupacao,
			Proprietario proprietario) {
		this.numeroApartamento = numeroApartamento;
		this.qtdQuartos = qtdQuartos;
		this.tipoOcupacao = tipoOcupacao;
		this.proprietario = proprietario;
	}

}
