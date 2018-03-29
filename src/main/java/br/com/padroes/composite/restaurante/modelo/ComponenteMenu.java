package br.com.padroes.composite.restaurante.modelo;

import java.math.BigDecimal;

public abstract class ComponenteMenu {
	
	public String getNome(){
		throw new UnsupportedOperationException();
	}
	
	public String getDescricao() {
		throw new UnsupportedOperationException();
	}
	
	public BigDecimal getPreco(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetariano(){
		throw new UnsupportedOperationException();
	}
	
	public  void imprimir(){
		throw new UnsupportedOperationException();
	}
	
	public void adicionar(ComponenteMenu cm){
		throw new UnsupportedOperationException();
	}
	
	public void remover(ComponenteMenu cm){
		throw new UnsupportedOperationException();
	}
	
	public ComponenteMenu getComponente(int i){
		throw new UnsupportedOperationException();
	}

}
