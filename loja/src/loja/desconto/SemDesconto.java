package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	protected BigDecimal aplicar(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

}
