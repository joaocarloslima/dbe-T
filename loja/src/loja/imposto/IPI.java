package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class IPI extends Imposto{

	public IPI(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcularImposto(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.04"));
	}

}
