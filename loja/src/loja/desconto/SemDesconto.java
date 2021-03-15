package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return BigDecimal.ZERO;
	}

}
