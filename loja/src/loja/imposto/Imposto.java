package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public interface Imposto {
	
	public BigDecimal calcular(Pedido pedido);

}
