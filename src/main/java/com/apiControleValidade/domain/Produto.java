package com.apiControleValidade.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Produto {

	private Integer Id;
	private Long codigoBarra;
	private String nome;
	private LocalDate dataCriação = LocalDate.now();
	private LocalDate dataVencimento;
	private String prioridade;
	
	private Produto produto;

	public Produto() {
		super();
	}

	public Produto(Integer id, Long codigoBarra, String nome, LocalDate dataCriação, LocalDate dataVencimento,
			String prioridade, Produto produto) {
		super();
		Id = id;
		this.codigoBarra = codigoBarra;
		this.nome = nome;
		this.dataCriação = dataCriação;
		this.dataVencimento = dataVencimento;
		this.prioridade = prioridade;
		this.produto = produto;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Long getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(Long codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCriação() {
		return dataCriação;
	}

	public void setDataCriação(LocalDate dataCriação) {
		this.dataCriação = dataCriação;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, codigoBarra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(codigoBarra, other.codigoBarra);
	}
	
	
	
	
	
	
}
