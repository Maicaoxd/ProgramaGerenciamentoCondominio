/*
 * Exemplo de lançamento das despesas e a geração do boleto Marina.
 * Autor: Maicon Alves Guedes
 */

package view;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import model.entity.Apartamento;
import model.entity.Cobranca;
import model.entity.CompApto;
import model.entity.Competencia;
import model.entity.Despesa;

public class Main {
	public static void main(String[] args) {
		// Crie os objetos necessários
		Apartamento apartamento = new Apartamento();
		Competencia competencia = new Competencia();
		Despesa despesa = new Despesa();
		apartamento.setNumApartamento(Integer.parseInt(JOptionPane.showInputDialog("Digite o NÚMERO DO APARTAMENTO")));
		despesa.setTpDespesa(JOptionPane.showInputDialog("Digite o TIPO DA DESPESA"));
		despesa.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o VALOR DA DESPESA")));
		competencia.getDespesas().add(despesa);

		// Associa a competência ao apartamento
		CompApto compApto = new CompApto(competencia, apartamento);
		apartamento.getCompApto().add(compApto);

		// Crie a cobrança com base na competência
		Cobranca cobranca = new Cobranca();
		cobranca.setReferencia(JOptionPane.showInputDialog("Digite a REFERÊNCIA da cobrança"));
		cobranca.setCompetencia(competencia);
		cobranca.setValor(competencia.calcularTotalDespesas());
		cobranca.setDtPagamento(LocalDate.now());

		// Exiba os detalhes da cobrança
		System.out.println("Boleto Gerado para o Apartamento: " + apartamento.getNumApartamento());
		System.out.println("Referência: " + cobranca.getReferencia());
		System.out.println("Valor: " + cobranca.getValor());
		System.out.println("Data de Pagamento: " + cobranca.getDtPagamento());
	}
}