package com.produtos.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.api.domain.Categoria;
import com.produtos.api.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria find(Integer id) {
		
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
