package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity //Indica che questa classe è un'entità JPA quindi farà riferimento a una tabella del DB di nome Category
public class Category {
	@Id //indica il campo Id come Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //generazione automatica del valore di Id
	private Long id;
	
	private String name; //nome della categoria
	//ora scrivo le relazioni con altre tabelle
	@OneToMany(mappedBy = "category")
	private List<Book> books;
	
	//ora impostiamo i getter e setter
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
