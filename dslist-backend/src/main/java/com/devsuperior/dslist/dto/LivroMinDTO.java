package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Livro;
import com.devsuperior.dslist.projections.LivroMinProjection;

public class LivroMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;	
	private String shortDescription;
	
	public LivroMinDTO() {
		
	}

	public LivroMinDTO(Livro entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public LivroMinDTO(LivroMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getLivroYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
	
}
