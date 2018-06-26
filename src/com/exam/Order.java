package com.exam;

public class Order {
	int id;
	String name;
	int price;
	int cal;
	
	public Order() {
		
	}
	
	public Order(int id, String name, int price, int cal) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cal = cal;
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
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}
}
