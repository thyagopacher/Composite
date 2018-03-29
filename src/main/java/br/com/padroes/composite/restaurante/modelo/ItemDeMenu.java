package br.com.padroes.composite.restaurante.modelo;

import java.math.BigDecimal;

public class ItemDeMenu extends ComponenteMenu {
	
	private final String nome;
	
	private final String descricao;
	
	private final boolean vegetariano;
	
	private final BigDecimal preco;

	public ItemDeMenu(String nome, String descricao, boolean vegetariano, BigDecimal preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.vegetariano = vegetariano;
		this.preco = preco;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public boolean isVegetariano() {
		return vegetariano;
	}
	
	@Override
	public BigDecimal getPreco() {
		return preco;
	}
	
	@Override
	public void imprimir() {
		System.out.print(String.format(" %s%s", this.nome, vegetariano ? "(v)" : ""));
		System.out.println(String.format(", %s", preco.toString()));
		if(descricao != null && !descricao.trim().isEmpty()){
			System.out.println(String.format("      -- %s", descricao));
		}
	}
	

}
