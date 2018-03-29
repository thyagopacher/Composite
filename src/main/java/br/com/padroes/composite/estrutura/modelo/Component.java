package br.com.padroes.composite.estrutura.modelo;

public interface Component {
	
	void print();
	
	void add(Component component);
	
	boolean remove(Component component);
	
	Component getChild(int pos);
}
