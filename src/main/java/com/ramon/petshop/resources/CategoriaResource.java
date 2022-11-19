package com.ramon.petshop.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramon.petshop.domain.Categoria;
import com.ramon.petshop.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	//Controler, Rest para categorias
	//Como tem diversos mapeamentos de rest posso colocar um mapeamento padrão no request mapping
	
	@Autowired
	CategoriaService service;
	
	//Aqui vou falar qual o verbo http que vai identificar a classe
	//O metodo tem que permitir para buscar como ID
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
