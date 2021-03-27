package loja.desconto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class DescontoPorQuantidade extends Desconto{

	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal aplicar(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean deveAplicar(PedidoInterface pedido) {
		return pedido.getQuantidadeDeItens() > 10;
	}

}
