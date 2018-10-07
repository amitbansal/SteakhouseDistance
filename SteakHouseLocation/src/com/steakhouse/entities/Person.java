package com.steakhouse.entities;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Person {
	
	public Person(String name, Point location) {
		super();
		this.name = name;
		this.location = location;
	}
	private String name;
	private Point location;
	private Steakhouse sh;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	
	public double getDistanceFromSteakhouse(Steakhouse sh){ 
/*		Point personPoint = this.getLocation();
		Point shPoint = sh.getLocation();
		int distance = (int) personPoint.distance(shPoint);*/
		
		double xOfSteakhouse =  sh.getLocation().getX();
		double yOfSteakhouse =  sh.getLocation().getY();
		double squareOfXOfSteakhouse = xOfSteakhouse*xOfSteakhouse;
		double squareOfYOfSteakhouse = yOfSteakhouse*yOfSteakhouse;
		return Math.sqrt(squareOfXOfSteakhouse + squareOfYOfSteakhouse);
	}

	public Map<Steakhouse, Double> getDistanceFromSteakhouses(List<Steakhouse> lstSteakhouse){
		List<Double> lstDistances = new ArrayList<>();
		Map mp = new HashMap<>();
		
		for(Steakhouse sh : lstSteakhouse){
			mp.put( sh, (Double)this.getDistanceFromSteakhouse(sh));			
		}
		return mp;
	}
}
