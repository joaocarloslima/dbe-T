package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeImposto {
	
	private Imposto imposto;
	
	public BigDecimal calcular(Pedido pedido) {
		return imposto.calcular(pedido);
	}

	public CalculadoraDeImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	

}
