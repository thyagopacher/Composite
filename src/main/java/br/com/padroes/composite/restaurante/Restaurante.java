package br.com.padroes.composite.restaurante;

import java.math.BigDecimal;

import br.com.padroes.composite.restaurante.modelo.ComponenteMenu;
import br.com.padroes.composite.restaurante.modelo.Garconete;
import br.com.padroes.composite.restaurante.modelo.ItemDeMenu;
import br.com.padroes.composite.restaurante.modelo.Menu;

public class Restaurante {
	
	private Garconete garconete;
	
	private ComponenteMenu menu;

	public Restaurante() {
		this.garconete = new Garconete();
	}
	
	public void criarMenu(){
		this.menu = new Menu("Menu", "Todos os menus");
		this.menu.adicionar(criarMenuJantar());
		this.menu.adicionar(criarMenuAlmoco());
		this.menu.adicionar(criarMenuCafe());
		
		garconete.setMenu(menu);
	}
	
	private ComponenteMenu criarMenuJantar(){
		final ComponenteMenu menu = new Menu("Menu Jantar", "com várias opções");
		
		menu.adicionar(new ItemDeMenu("Lazanha", "Lazanha de queijo, presunto e carne moída", false, new BigDecimal("10.50")));
		menu.adicionar(new ItemDeMenu("Sopa de Feijão", "", false, new BigDecimal("15.00")));
		menu.adicionar(new ItemDeMenu("Macarão à Carbonara", "", false, new BigDecimal("20.00")));
		menu.adicionar(new ItemDeMenu("Nhoque", "Nhoque com acompanhamento de carne moída", false, new BigDecimal("9.00")));
		
		return menu;
	}
	
	private ComponenteMenu criarMenuAlmoco(){
		final ComponenteMenu menu = new Menu("Menu Almoço", "do mais simples ao mais sofisticado");
		
		menu.adicionar(new ItemDeMenu("Bife a Cavalo", "Bife com ovo", false, new BigDecimal("12.00")));
		menu.adicionar(new ItemDeMenu("Arroz com Feijão", "", false, new BigDecimal("15.00")));
		menu.adicionar(new ItemDeMenu("Sopa de ervilha", "", false, new BigDecimal("13.50")));
	
		return menu;
	}
	
	private ComponenteMenu criarMenuCafe(){
		final ComponenteMenu menu = new Menu("Menu Cafe", "cafés e pequenos lanches");
		
		menu.adicionar(new ItemDeMenu("Café preto", "", false, new BigDecimal("1.00")));
		menu.adicionar(new ItemDeMenu("Pingado", "", false, new BigDecimal("1.50")));
		menu.adicionar(new ItemDeMenu("Chafé", "", false, new BigDecimal("0.50")));
		menu.adicionar(new ItemDeMenu("Misto quente", "", false, new BigDecimal("3.00")));
	
		return menu;
	}

	public Garconete getGarconete() {
		return garconete;
	}

}
