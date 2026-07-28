package com.klef.soa.dto;

public class ProductDTO 
{ 
	private int id;
	
	private String DTO;
	private double price;
	private String description;
	private String category;
	private String imageurl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDTO() {
		return DTO;
	}
	public void setDTO(String dTO) {
		DTO = dTO;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	

}
