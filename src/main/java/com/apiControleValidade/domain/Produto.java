package com.apiControleValidade.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.apiControleValidade.domain.enuns.Prioridade;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto implements Serializable{	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private Long codigoBarra;
	private String nome;
	
	@JsonFormat(pattern = "dd/mm/yyyy")
	private LocalDate dataCriação = LocalDate.now();
	
	@JsonFormat(pattern = "dd/mm/yyyy")
	private LocalDate dataVencimento;
	
	private Prioridade prioridade;
	
	@ManyToOne
	@JoinColumn(name = "repositor_id")
	private Repositor repositor;

	public Produto() {
		super();
	}


	public Produto(Integer id, Long codigoBarra, String nome, LocalDate dataVencimento,
			Prioridade prioridade, Repositor repositor) {
		super();
		Id = id;
		this.codigoBarra = codigoBarra;
		this.nome = nome;
		this.dataVencimento = dataVencimento;
		this.prioridade = prioridade;
		this.repositor = repositor;
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

	public Prioridade getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}


	public Repositor getRepositor() {
		return repositor;
	}


	public void setRepositor(Repositor repositor) {
		this.repositor = repositor;
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
