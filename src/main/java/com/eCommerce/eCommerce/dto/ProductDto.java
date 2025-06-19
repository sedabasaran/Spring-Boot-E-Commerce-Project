package com.eCommerce.eCommerce.dto;

import java.math.BigDecimal;

public class ProductDto {

	private Long id;

	private String name;

	private String brand;

	private BigDecimal price;

	private int inventory;

	private String description;

	private String categoryName;

	public ProductDto() {
	}

	public ProductDto(Long id, String name, String brand, BigDecimal price, int inventory, String description,
			String categoryName) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.inventory = inventory;
		this.description = description;
		this.categoryName = categoryName;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
