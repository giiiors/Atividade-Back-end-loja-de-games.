package com.generation.lojaDeGames.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojaDeGames.Repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")

public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
}
