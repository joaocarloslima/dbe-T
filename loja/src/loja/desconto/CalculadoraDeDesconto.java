package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Pedido pedido) {
		
		Desconto cadeiaDeDesconto = 
				new DescontoPorQuantidade(
				new DescontoPorValor(
				new SemDesconto()
			));
		
		return cadeiaDeDesconto.calcular(pedido);
		

	}

}
