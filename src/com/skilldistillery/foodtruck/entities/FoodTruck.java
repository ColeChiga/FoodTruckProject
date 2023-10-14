package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	//fields
	private static int nextTruckId=1;
	private int individualID;
	private String name;
	private String foodType;
	private int rating;
	
	//constructor
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.setId();
	}

	//getters/setters

	//truck ID
	public int getIndividualId() {
		return nextTruckId;
	}
	
	private void setId() {
		individualID = 121 * nextTruckId;
	
		nextTruckId = nextTruckId+1;
	}

	//Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Food Type
	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	//Rating
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	//toString
	@Override
	public String toString() {
		return "FoodTruck [individualID=" + individualID + ", name=" + name + ", foodType=" + foodType + ", rating="
				+ rating + "]";
	}

	
	
	
	
}
