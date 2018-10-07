package com.steakhouse.entities;
import java.awt.Point;

public class Steakhouse {
	
	public Steakhouse(String name, Point location) {
		super();
		this.location = location;
		this.name = name;
	}
	private Point location;
	private String name;
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Steakhouse [location=" + location + ", name=" + name + "]";
	}
	
	
}
