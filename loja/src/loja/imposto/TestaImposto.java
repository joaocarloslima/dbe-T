package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;
import loja.PedidoInterface;

public class TestaImposto {

	public static void main(String[] args) {
		CalculadoraDeImposto calculadoraDeImposto = 
				new CalculadoraDeImposto(new ICMS(new ISS(new IPI(null))));
		
		PedidoInterface pedido = new Pedido(new BigDecimal("100"));
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);

		
	}
}
