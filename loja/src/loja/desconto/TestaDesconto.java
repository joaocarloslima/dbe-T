package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;
import loja.PedidoInterface;

public class TestaDesconto {
	
	public static void main(String[] args) {
		CalculadoraDeDesconto calculadoraDeDesconto = 
				new CalculadoraDeDesconto();
		
		PedidoInterface pedido = new Pedido(new BigDecimal("100"), 15);
		
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		System.out.println(desconto);
		
	}

}
