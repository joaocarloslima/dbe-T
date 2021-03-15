package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}

	public abstract BigDecimal calcular (Pedido pedido);

}
