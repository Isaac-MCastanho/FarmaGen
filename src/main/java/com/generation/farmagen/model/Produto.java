package com.generation.farmagen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank(message="O atributo titulo é obrigatorio")
	@Size(min=5,max=50,message="O titulo deve conter entre 5 e 100 caracteres")
	private String titulo;
	
	
	@NotBlank(message="O atributo descrição é obrigatorio")
	@Size(min=10,max=200,message="A descrição deve conter entre 10 e 200 caracteres")
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Categoria categoria;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
