package loja;

import java.math.BigDecimal;

public class Pedido {
	private BigDecimal valor;
	private int quantidadeDeItens;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeDeItens = 1;
	}
	
	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}



	public BigDecimal getValor() {
		return valor;
	}
	
}
