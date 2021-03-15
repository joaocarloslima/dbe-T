package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class TestaDesconto {
	
	public static void main(String[] args) {
		CalculadoraDeDesconto calculadoraDeDesconto = 
				new CalculadoraDeDesconto();
		
		Pedido pedido = new Pedido(new BigDecimal("100"), 15);
		
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		System.out.println(desconto);
		
	}

}
