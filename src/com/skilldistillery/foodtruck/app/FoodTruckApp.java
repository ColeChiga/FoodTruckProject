package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.*;
import java.util.Scanner;

public class FoodTruckApp {

	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	}

	//running the program,
	public void run() {

		Scanner sc = new Scanner(System.in);
		String name;
		String foodType;
		int rating;
		boolean trucks = true;
		int choice;
		
		//parts 1 and 2
		do {
			// input name for food truck or quit 
			System.out.print("Please input the name of a food truck or type \"quit\" to finish: ");
			name = sc.nextLine();

			// quit: part 2
			if (name.toLowerCase().equals("quit")) {
				break;
			}

			// input food type
			System.out.print("Please input the food type that the " + name + " truck carries: ");
			foodType = sc.nextLine();

			// input rating
			System.out.print("Please input the rating that the " + name + " truck has: ");
			rating = sc.nextInt();

			//skip line and clear input
			System.out.println();
			sc.nextLine();

			//puts data into food truck class
			trucks = addTruck(name, foodType, rating);

		} while (trucks);
		
		//reset boolean trucks
		trucks = true;

		// runs menu for parts 3 and 4
		while (trucks) {
			//show menu, let user choose option
			menu();
			choice = sc.nextInt();
			System.out.println();
			
			//analyze users choice, access methods for implementing the choice
			if (choice == 1) {
				printFleetInfo();
			} else if (choice == 2) {
				System.out.printf("The average rating for the fleet of trucks is: %.2f%n", calculateAverage());
			} else if (choice == 3) {
				System.out.println("The food truck with the highest rating is: " + highestRating().toString());
			} else if (choice == 4) { //quit
				System.out.println("Thank you for visiting.\nSee you next time!");
				trucks = false;
			} else { //error message
				System.err.println("Invalid choice.\nTry again.");
			}
		}

		sc.close();
	}

	//menu for parts 3 and 4
	public void menu() {
		System.out.println();
		System.out.println(" Welcome to the fleet!");
		System.out.println("–––––––––––––––––––––––");
		System.out.println(" 1. List food trucks");
		System.out.println(" 2. See average rating");
		System.out.println(" 3. Highest rated truck");
		System.out.println(" 4. Quit");
		System.out.print("Please select the number you would like to choose: ");

	}

	//add a truck to the fleet. Parse through fleet array and find empty spots
	public boolean addTruck(String name, String type, int rating) {
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				fleet[i] = new FoodTruck(name, type, rating);	
				
				if (i== (fleet.length - 1)){
					return false;
				}
				return true;
			}
		}
		
		return false;
	}

	//print to strings for each truck in the fleet
	public void printFleetInfo() {
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				continue;
			} 
			System.out.println(fleet[i].toString());
		}
	}
	
	//calculate the average rating for the trucks

	public double calculateAverage() {
		double average = 0;
		int incriment = 0;

		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null) {
				average += foodTruck.getRating();
				incriment++;
			}
		}
		average /= incriment;

		return average;
	}
	
	//determines the highest rating of all trucks in the fleet

	public FoodTruck highestRating() {

		FoodTruck foodTruck = fleet[0];
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				continue;
			} else if (foodTruck.getRating() < fleet[i].getRating()) {
				foodTruck = fleet[i];
			}
		}

		return foodTruck;
	}

}
