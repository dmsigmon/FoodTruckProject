package com.skilldistillery.foodproject;

public class FoodTruck {
	
	private static int uniqueId;
	private int rating;
	private String name;  
	private String foodType;
	
	public FoodTruck(int rating, String name, String foodType, int uniqueId) {
		this.rating = rating;
		this.name = name;
		this.foodType = foodType;
		FoodTruck.uniqueId = uniqueId;
	}
	
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		FoodTruck.uniqueId = uniqueId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	
	
	
}
