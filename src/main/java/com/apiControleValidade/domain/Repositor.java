package com.apiControleValidade.domain;

import java.util.ArrayList;
import java.util.List;

public class Repositor extends Pessoa{
	
	private List<Produto> produtos = new ArrayList<>();

	public Repositor() {
		super();
	}

	public Repositor(Integer id, String nome, String email, String senha) {
		super(id, nome, email, senha);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
	
}
