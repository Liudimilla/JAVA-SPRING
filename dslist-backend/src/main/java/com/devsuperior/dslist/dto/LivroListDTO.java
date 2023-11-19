package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.LivroList;

public class LivroListDTO {

	private Long id;
	private String name;
	
	public LivroListDTO() {
		
	}
	
	public LivroListDTO(LivroList entity) {
		id = entity.getId();
		name = entity.getName();	
	
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}