package com.produtos.api;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.produtos.api.domain.Categoria;
import com.produtos.api.repositories.CategoriaRepository;

@SpringBootApplication
public class ApiprodutosApplication implements CommandLineRunner{
	
	private CategoriaRepository categoriaRepository; 

	public static void main(String[] args) {
		SpringApplication.run(ApiprodutosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	
}

