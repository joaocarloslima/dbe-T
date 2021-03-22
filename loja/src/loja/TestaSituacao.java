package loja;

import java.math.BigDecimal;

public class TestaSituacao {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("100"));
		pedido.handler.subscribe(new EmailListener());
		pedido.handler.subscribe(new LogListener());
		
		System.out.println(pedido.getSituacao());
		
		pedido.pagar();
		System.out.println(pedido.getSituacao());

		pedido.entregar();
		pedido.abrirChamado();
		System.out.println(pedido.getSituacao());
		
		//pedido.cancelar();
	}
}
