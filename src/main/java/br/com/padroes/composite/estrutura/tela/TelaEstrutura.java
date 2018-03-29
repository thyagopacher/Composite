package br.com.padroes.composite.estrutura.tela;

import br.com.padroes.composite.estrutura.modelo.Composite;
import br.com.padroes.composite.estrutura.modelo.Leaf;

public class TelaEstrutura {
	
	private Composite composite;
	
	public TelaEstrutura() {
	}
	
	public TelaEstrutura criarEstrutura(){
		final Leaf textc2 = new Leaf("texto imagem 2");
		final Leaf linhac2 = new Leaf("linha imagem 2");
		final Composite c2 = new Composite("imagem 2");
		c2.add(textc2);
		c2.add(linhac2);
		
		final Leaf retanguloc1 = new Leaf("retangulo imagem 1");
		final Leaf linhac1 = new Leaf("texto imagem 2");
		
		composite = new Composite("imagem 1");
		composite.add(c2);
		composite.add(linhac1);
		composite.add(retanguloc1);
		
		return this;
	}
	
	public void mostrar(){
		if(composite != null){
			composite.print();	
		}
	}

}
