package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public BigDecimal calcular(PedidoInterface pedido) {
		BigDecimal valorDoImposto = calcularImposto(pedido);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) valorDoOutroImposto = outroImposto.calcular(pedido);
		
		return valorDoImposto.add(valorDoOutroImposto);
	}

	protected abstract BigDecimal calcularImposto(PedidoInterface pedido);

}
