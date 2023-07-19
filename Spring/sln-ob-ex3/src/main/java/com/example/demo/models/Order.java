package com.example.demo.models;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user")
	private String userName;
	
	@Column(name="listProducts")
	private String[] products;

	public Order() {
	}

	public Order(Long id, String userName, String[] products) {
		super();
		this.id = id;
		this.userName = userName;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userName=" + userName + ", products=" + Arrays.toString(products) + "]";
	}
	
}
