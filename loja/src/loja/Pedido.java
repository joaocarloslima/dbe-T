package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.Situacao;

public class Pedido implements PedidoInterface {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private Situacao situacao;
	public PedidoHandler handler;
	
	@Override
	public String getEndereco() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Rua 123, São Paulo - SP";
		
	}

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

	@Override
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	@Override
	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public void pagar() {
		this.situacao.pagar(this);
	}

	@Override
	public void entregar() {
		this.situacao.entregar(this);
	}

	@Override
	public void cancelar() {
		this.situacao.cancelar(this);

	}

	@Override
	public void reabrir() {
		this.situacao.reabrir(this);

	}

	@Override
	public void abrirChamado() {
		this.situacao.abrirChamado();
	}

	@Override
	public Situacao getSituacao() {
		return situacao;
	}

	@Override
	public void setSituacao(Situacao situacao) {
		handler.notify(this);
		this.situacao = situacao;
	}
	
	

}
