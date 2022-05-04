package com.bookstore.Bookstore.dio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String quantity;
	private int price;
	private String category;
	
	@Column(columnDefinition="text")
	private String img;

	
	public String getImage() {
		return img;
	}
	public void setImage(String img) {
		this.img = img;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
