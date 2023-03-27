package com.apiControleValidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiControleValidade.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
