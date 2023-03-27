package com.apiControleValidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiControleValidade.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
