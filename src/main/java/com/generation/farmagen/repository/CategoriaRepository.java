package com.generation.farmagen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmagen.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

	public List<Categoria> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
