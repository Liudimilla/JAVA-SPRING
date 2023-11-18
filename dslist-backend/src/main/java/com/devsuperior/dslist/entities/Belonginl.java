package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonginl")
public class Belonginl {

	@EmbeddedId
	private BelonginlPK id = new BelonginlPK();
	
	private Integer position;
	
	public Belonginl() {
		
	}

	public Belonginl(Livro livro, LivroList list ,Integer position) {
		id.setLivro(livro);
		id.setList(list);
		this.position = position;
	}

	public BelonginlPK getId() {
		return id;
	}

	public void setId(BelonginlPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonginl other = (Belonginl) obj;
		return Objects.equals(id, other.id) && Objects.equals(position, other.position);
	}

	
}
