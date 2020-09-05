package com.skilldistillery.foodproject;

public class FoodTruck {

	private int uniqueId;
	private int rating;
	private String name;
	private String foodType;

	public FoodTruck(int rating, String name, String foodType, int uniqueId) {
		this.rating = rating;
		this.name = name;
		this.foodType = foodType;
		this.uniqueId = uniqueId;
	}
	
	//ASK ABOUT THE UNIQUE ID BEING STATIC AND HOW TO FIX IT!!!!!

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [uniqueId=");
		builder.append(uniqueId);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", name=");
		builder.append(name);
		builder.append(", foodType=");
		builder.append(foodType);
		builder.append("]");
		return builder.toString();
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
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
