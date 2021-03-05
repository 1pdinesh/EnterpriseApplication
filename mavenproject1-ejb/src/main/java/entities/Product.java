/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Asus
 */
public class Product {
    private String Name;
	private double price;
    public Product(String name, double price) {
		super();
		Name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}
