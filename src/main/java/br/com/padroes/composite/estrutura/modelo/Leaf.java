package br.com.padroes.composite.estrutura.modelo;

public class Leaf implements Component{

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println(name);
	}

	@Override
	public void add(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int pos) {
		throw new UnsupportedOperationException();
	}

}
