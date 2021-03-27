package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class ISS extends Imposto{

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcularImposto(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

}
