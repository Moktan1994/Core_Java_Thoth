package com.main.dto;

public class DogDTO {

	private int id;
	private String name;
	private String color;

	public DogDTO() {

	}

	public DogDTO(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public int getDid() {
		return id;
	}

	public void setDid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "DogDTO [did=" + id + ", name=" + name + ", color=" + color + "]";
	}

}
