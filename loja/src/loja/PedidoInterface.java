package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public interface PedidoInterface {

	String getEndereco();

	int getQuantidadeDeItens();

	BigDecimal getValor();

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

	void abrirChamado();

	Situacao getSituacao();

	void setSituacao(Situacao situacao);

}