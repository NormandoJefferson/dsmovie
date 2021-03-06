package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	// Temos que usar o new na chave composta para garantir 
	// que ela seja instanciada.
	@EmbeddedId
	private ScorePK id = new ScorePK();  
	
	private Double value;
	
	public Score() {
		
	}
	
	// O movie e user são setados no ScorePK id através
	// do setMovie e setUser.
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}
	
	public void setId(ScorePK id) {
		this.id = id;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
}
