package com.eCommerce.eCommerce.request.category;

public class CreateCategoryRequest {

	private String name;

	public CreateCategoryRequest() {
	}

	public CreateCategoryRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
