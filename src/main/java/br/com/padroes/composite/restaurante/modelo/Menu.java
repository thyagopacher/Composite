package br.com.padroes.composite.restaurante.modelo;

import java.util.ArrayList;
import java.util.List;

public class Menu extends ComponenteMenu{
	
	private final List<ComponenteMenu> componentes;
	private final String nome;
	private final String descricao;

	public Menu(String nome, String descricao) {
		this.componentes = new ArrayList<>();
		this.nome = nome;
		this.descricao= descricao;
	}
	
	
	@Override
	public void adicionar(ComponenteMenu cm) {
		this.componentes.add(cm);
	}
	
	@Override
	public void remover(ComponenteMenu cm) {
		this.componentes.remove(cm);
	}
	
	@Override
	public ComponenteMenu getComponente(int i) {
		try {
			return this.componentes.get(i);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	@Override
	public void imprimir() {
		System.out.print(String.format("\n\n%s", nome));
		System.out.println(String.format(", %s", descricao));
		System.out.println("-----------------------------");
		
		this.componentes.forEach(ComponenteMenu::imprimir);
	
//		for(ComponenteMenu cm : this.componentes){
//			cm.imprimir();
//		}
	}
	

}
