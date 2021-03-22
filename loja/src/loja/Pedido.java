package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.Situacao;

public class Pedido {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private Situacao situacao;
	public PedidoHandler handler;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeDeItens = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void pagar() {
		this.situacao.pagar(this);
	}

	public void entregar() {
		this.situacao.entregar(this);
	}

	public void cancelar() {
		this.situacao.cancelar(this);

	}

	public void reabrir() {
		this.situacao.reabrir(this);

	}

	public void abrirChamado() {
		this.situacao.abrirChamado();
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		handler.notify(this);
		this.situacao = situacao;
	}
	
	

}
