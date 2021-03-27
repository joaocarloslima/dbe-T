package loja.desconto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(PedidoInterface pedido) {
		
		Desconto cadeiaDeDesconto = 
				new DescontoPorQuantidade(
				new DescontoPorValor(
				new SemDesconto()
			));
		
		return cadeiaDeDesconto.calcular(pedido);
		

	}

}
