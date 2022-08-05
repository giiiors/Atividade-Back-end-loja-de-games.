package com.generation.lojaDeGames.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_categoria")

public class CategoriaModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


}
