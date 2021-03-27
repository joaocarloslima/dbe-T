package loja.desconto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class DescontoPorValor extends Desconto{

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal aplicar(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean deveAplicar(PedidoInterface pedido) {
		return pedido.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
