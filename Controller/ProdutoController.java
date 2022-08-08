package com.generation.lojaDeGames.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojaDeGames.Model.ProdutoModel;
import com.generation.lojaDeGames.Repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")

public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping("/preco_incial/{inicio}/preco_final/{fim}")
	public ResponseEntity<List<ProdutoModel>> getByPrecoEntre(@PathVariable BigDecimal inicio, @PathVariable BigDecimal fim){
		return ResponseEntity.ok(repository.findAllPrecoBetween(inicio, fim));
				
	}
}
