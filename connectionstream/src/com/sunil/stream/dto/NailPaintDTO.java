package com.sunil.stream.dto;

import java.io.Serializable;

import com.sunil.stream.constants.FinishType;

public class NailPaintDTO implements Serializable{
	
	private String brand;
	private String color;
	private double price;
	private boolean shining;
	private FinishType type;
	
	public NailPaintDTO() {
		System.out.println("created NailPaintDTO default constructor");
	}

	public NailPaintDTO(String brand, String color, double price, boolean shining, FinishType type) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.shining = shining;
		this.type = type;
	}

	@Override
	public String toString() {
		return "NailPaintDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", shining=" + shining
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NailPaintDTO other = (NailPaintDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isShining() {
		return shining;
	}

	public void setShining(boolean shining) {
		this.shining = shining;
	}

	public FinishType getType() {
		return type;
	}

	public void setType(FinishType type) {
		this.type = type;
	}
	

}
