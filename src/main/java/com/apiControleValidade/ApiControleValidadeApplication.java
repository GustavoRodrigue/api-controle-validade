package com.apiControleValidade;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apiControleValidade.domain.Produto;
import com.apiControleValidade.domain.Repositor;
import com.apiControleValidade.domain.enuns.Perfil;
import com.apiControleValidade.domain.enuns.Prioridade;
import com.apiControleValidade.repositories.RepositorRepository;
import com.apiControleValidade.repositories.ProdutoRepository;

@SpringBootApplication
public class ApiControleValidadeApplication implements CommandLineRunner {

	
	@Autowired
	private RepositorRepository repositorRepository ;
	
	@Autowired
	 private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiControleValidadeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Repositor r1 =  new Repositor(null, "Gustavo", "E03313", "1234");
		r1.addPerfil(Perfil.ADMIN);
		
		Produto p1 = new Produto(null, 22333333L, "biscoito", null, Prioridade.ALTA, r1);
		
		
		
		
	}

}
