package loja;

public class LogListener implements Listener{

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Gravando log do pedido " + pedido);
	}

}
