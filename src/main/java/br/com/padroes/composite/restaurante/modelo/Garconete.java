package br.com.padroes.composite.restaurante.modelo;

public class Garconete {
	
	private  ComponenteMenu menu;
	
	public Garconete() {
	}

	public ComponenteMenu getMenu() {
		return menu;
	}

	public void setMenu(ComponenteMenu menu) {
		this.menu = menu;
	}
	
	public void imprimirMenu(){
		if(this.menu != null){
			menu.imprimir();
		}
	}
	
	

}
