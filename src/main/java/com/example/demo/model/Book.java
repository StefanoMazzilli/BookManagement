package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	/*
	 * l'entità Book è il lato proprietario delle relazioni
	 * questo significa che Book conterrà la chiave esterna (FK) categiory_id che fa riferimento alla tabella Category
	 * l'annotazione @ManyToOne indica che molti libri possono appartenere a una singola categoria
	 * l'annotazione @JoinColumn(name="category_id") specifica il nome della colonna nel DB
	 * che rappresenta la chiave esterna
	 * 
	 * la stessa cosa faccio con Author
	 */
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	//getters e setters
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
