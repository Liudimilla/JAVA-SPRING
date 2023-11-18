package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Embeddable
public class BelonginlPK {

	@ManyToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private LivroList list;
	
	public BelonginlPK() {
		
	}
	
	public BelonginlPK(Livro livro, LivroList list) {
		this.livro = livro;
		this.list = list;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LivroList getList() {
		return list;
	}

	public void setList(LivroList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list, livro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelonginlPK other = (BelonginlPK) obj;
		return Objects.equals(list, other.list) && Objects.equals(livro, other.livro);
	}

		
	
	
}


