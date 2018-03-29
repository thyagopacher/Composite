package br.com.padroes.composite.estrutura.modelo;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
	
	private String name;
	
	private List<Component> children = new ArrayList<>();
	
	public Composite(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(String.format("%s: {", name));
		for(int i=0; i<children.size() ; i++){
			children.get(i).print();
		}
		System.out.println("}");
	}
	
	public void add(Component component) {
		this.children.add(component);
	}

	public boolean remove(Component component) {
		if(this.children.contains(component)){
			this.children.remove(component);
			return true;
		}
		return false;
	}

	public Component getChild(int pos) {
		try {
			return this.children.get(pos);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
}
