package com.ramon.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramon.petshop.domain.Categoria;
import com.ramon.petshop.repository.CategoriaRepository;
import com.ramon.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class CategoriaService {

	// Injetando CategoriaRepository
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException(
				"Objeto não encontrado. ID: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
