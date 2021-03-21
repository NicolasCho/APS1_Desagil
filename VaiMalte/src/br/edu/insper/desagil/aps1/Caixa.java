package br.edu.insper.desagil.aps1;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> dicDescontos;
	
	public Caixa() {
		this.dicDescontos = new HashMap<>();
	}
	
	public void insereDesconto(Produto produto, int i) {
		if(i>=1 && i<=99) {
			int codigo = produto.getCodigo();
			this.dicDescontos.put(codigo, i);
		}
	}
	
	public double totalCarrinho(Carrinho carrinho) {
		double total = 0;
		for(Pedido pedido:carrinho.getListaPedidos()) {
			Produto produto = pedido.getProduto();
			int codigo = produto.getCodigo();
			
			if (dicDescontos.containsKey(codigo)) {
				int desconto = dicDescontos.get(codigo);
				total += pedido.totalPedido()*(1-(double)desconto/100);
			}
			else {
				total += pedido.totalPedido();
			}
		}
		return total;
	}
}
