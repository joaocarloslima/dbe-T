package loja.situacao;

import loja.PedidoInterface;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado() {
		new ChamadoFacade().abrir(null);
		System.out.println("Chamado aberto para financeiro");
	}

	@Override
	public void pagar(PedidoInterface pedido) {
		pedido.setSituacao(new Pago());
	}
	//OIM
	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	
	
	

}
