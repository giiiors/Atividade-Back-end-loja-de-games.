package com.generation.lojaDeGames.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojaDeGames.Model.CategoriaModel;

	@Repository
	public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
}

