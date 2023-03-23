package com.apiControleValidade.domain;

import java.util.ArrayList;
import java.util.List;

import com.apiControleValidade.domain.enuns.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Repositor extends Pessoa{
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "repositor")
	private List<Produto> produtos = new ArrayList<>();

	public Repositor() {
		super();
		addPerfil(Perfil.REPOSITOR);
	}

	public Repositor(Integer id, String nome, String email, String senha) {
		super(id, nome, email, senha);
		addPerfil(Perfil.REPOSITOR);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
	
}
