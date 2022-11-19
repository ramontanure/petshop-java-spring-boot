package com.ramon.petshop.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	//Controler, Rest para categorias
	//Como tem diversos mapeamentos de rest posso colocar um mapeamento padrão no request mapping
	
	//Aqui vou falar qual o verbo http que vai identificar a classe
	@RequestMapping(method = RequestMethod.GET)
	public String mostrar() {
		return "Teste REST Categorias!";
	}

}
