package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruck[] fTArr = new FoodTruck[5];

		Scanner kb = new Scanner(System.in);

		double accumlativeRatings = 0;
		double avgRating = 0.0;
		int highestRating = 0;
		String bestFoodTruck = "";

		for (int i = 0; i < 5; i++) {

			FoodTruck foodTruck = new FoodTruck(0, null, null, i);

			System.out.println(" You can enter up to 5 different food trucks (type Quit for food truck name to exit");

			System.out.println("What is the name of the food truck?");
			foodTruck.setName(kb.next());

			if (foodTruck.getName().equals("quit")) {
				break;
			}
			// add if clause to break loop if name is "quit"

			System.out.println("What is the food type of the food truck?");
			foodTruck.setFoodType(kb.next());

			System.out.println("What is the rating of the food truck between [1-5]?");
			foodTruck.setRating(kb.nextInt());

			accumlativeRatings += foodTruck.getRating();

			avgRating = accumlativeRatings / (i + 1);

			foodTruck.setUniqueId(i);

			fTArr[i] = foodTruck;

			if (highestRating < foodTruck.getRating()) {
				bestFoodTruck = fTArr[i].toString();

			}
		}

		boolean flag = true;
		while (flag) {
			System.out.println("-------------------------------------------");
			System.out.println("            Select and Option              ");
			System.out.println("(1) List all existing food trucks          ");
			System.out.println("(2) See the average rating of food trucks  ");
			System.out.println("(3) Display the highest rated food truck   ");
			System.out.println("(4) Quit the Program                       ");
			System.out.println("-------------------------------------------");
			int menuOption = kb.nextInt();

			if (menuOption == 1) {
				for (int i = 0; i < fTArr.length; i++) {
					if (fTArr[i] == null) {
						continue;
					} else {
						System.out.println(fTArr[i].toString());
					}
				}
			} else if (menuOption == 2) {
				System.out.println(avgRating);
			} else if (menuOption == 3) {
				System.out.println(bestFoodTruck);
			} else if (menuOption == 4) {
				System.out.println("*******************************************************");
				System.out.println("***Thank you for visiting Douglas Food Trucks Inc \u00A9 **");
				System.out.println("*******************************************************");
				flag = false;
			}
		}
		kb.close();
	}

}
