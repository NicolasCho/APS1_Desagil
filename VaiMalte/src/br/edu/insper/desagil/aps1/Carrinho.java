package br.edu.insper.desagil.aps1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> listaPedidos;
	
	public Carrinho() {
		this.listaPedidos = new ArrayList<>();
	}

	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}
	
	public void adicionaProduto(Produto produto) {
		boolean naLista = false;
		for (Pedido pedido:listaPedidos) {                  
			if (pedido.getProduto().getCodigo() == produto.getCodigo()) {
				pedido.incrementa();
				naLista = true;
			}
		}
		if (naLista == false){
			Pedido pedido = new Pedido(produto);
			this.listaPedidos.add(pedido);
		}
	}
	
}
