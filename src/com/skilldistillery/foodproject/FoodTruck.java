package com.skilldistillery.foodproject;

public class FoodTruck {

	private static int nextUniqueId;
	private int uniqueId;
	private int rating;
	private String name;
	private String foodType;

	public FoodTruck(int rating, String name, String foodType, int nextUniqueId ) {
		this.rating = rating;
		this.name = name;
		this.foodType = foodType;
		this.uniqueId = nextUniqueId ;
	}
	
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


	public int getnextUniqueId() {
		return nextUniqueId;
	}


	public void setnextUniqueId(int uniqueId) {
		this.nextUniqueId = uniqueId;
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
