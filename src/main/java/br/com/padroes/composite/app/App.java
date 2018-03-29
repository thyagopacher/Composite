package br.com.padroes.composite.app;

import br.com.padroes.composite.restaurante.Restaurante;

public class App {
	
	public static void main(String[] args) {
//		new TelaEstrutura().criarEstrutura().mostrar();
		
		final Restaurante restaurante = new Restaurante();
		restaurante.criarMenu();
		restaurante.getGarconete().imprimirMenu();
	}

}
