package com.generation.lojaDeGames.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojaDeGames.Model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
public List <ProdutoModel> findProdutoBetween (@Param("inicio") BigDecimal inicio, @Param ("fim") BigDecimal fim);
	

}
