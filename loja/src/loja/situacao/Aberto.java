package loja.situacao;

import loja.Pedido;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Chamado aberto para financeiro");
	}

	@Override
	public void pagar(Pedido pedido) {
		pedido.setSituacao(new Pago());
	}
	//OIM
	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	
	
	

}
