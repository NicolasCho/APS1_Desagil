package br.edu.insper.desagil.aps1;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		if (caixa.totalCarrinho(carrinho)==0){
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		Produto produto = new Produto(23, "Amstel", 2.09);
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto);
		Caixa caixa = new Caixa();
		if (caixa.totalCarrinho(carrinho)==2.09) {
			return true;
		}
		return false;
	}

	public boolean testeC() {
		Produto produto = new Produto(23, "Amstel", 2.09);
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(produto);
		Caixa caixa = new Caixa();
		
		caixa.insereDesconto(produto, 20);
		
		if(caixa.totalCarrinho(carrinho)==1.672) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Produto produto1 = new Produto(15, "Colorado", 6.30);
		Produto produto2= new Produto(2, "Patagonia", 15.90);
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();		
		
		carrinho.adicionaProduto(produto1);
		carrinho.adicionaProduto(produto2);
		carrinho.adicionaProduto(produto2);
		caixa.insereDesconto(produto1, 30);
		
		if(caixa.totalCarrinho(carrinho)==36.21) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		Produto produto1 = new Produto(15, "Colorado", 6.30);
		Produto produto2 = new Produto(2, "Patagonia", 15.90);
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();		

		carrinho.adicionaProduto(produto1);
		carrinho.adicionaProduto(produto2);
		carrinho.adicionaProduto(produto2);
		caixa.insereDesconto(produto2, 40);
		
		if(caixa.totalCarrinho(carrinho)==25.38) {
			return true;
		}
	    return false;
	}
}
