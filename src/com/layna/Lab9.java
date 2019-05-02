//05/01 Layna Shepherd
package com.layna;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		//printing menu 
		Scanner scan = new Scanner(System.in);
		ArrayList<String> itemName = listOfNames();
		ArrayList<Double> itemPrice = listOfPrices();
		ArrayList<String> orderName = new ArrayList<>();
		ArrayList<Double> orderPrice = new ArrayList<>();
		
	 //display menu
		System.out.println("Welcome to Geunther's market!");
		printMenu(itemName, itemPrice);
		
	
		String userInput;
		//ask user for item from menu and add to cart if possible
		do {
		System.out.println("What item would you like to order?");
		String itemOrdered = scan.nextLine();
		//System.out.println(itemOrdered);
		if ( itemOrdered.equalsIgnoreCase(itemName)) {
			orderName.add(itemOrdered);
			//display item name and price in their cart
			System.out.println("Adding " + (itemOrdered) + "to cart for " + (itemPrice(i)));
		
			//display error
		} else {
			System.out.println("Sorry, we dont havee those! Please try again.");
		} //ask if user wants to add another
		System.out.println("would you like to order anything else? (y/n)");
		String userInput1 = scan.nextLine();
		}while (userInput.equalsIgnoreCase("Y"));
			
		System.out.println("Thanks for your order!");
		System.out.println("Heres what you got:");
		printMenu(orderName,orderPrice);
	}
		
	
			//if not, make list of what's in their basket and prices
		
		//display average price of items ordered
		
		
	


public static ArrayList<String> listOfNames(){
	ArrayList<String> itemName = new ArrayList<>();
	itemName.add("Apple");
	itemName.add("Banana");
	itemName.add("Cauliflower");
	itemName.add("Dragonfruit");
	itemName.add("Elderberry");
	itemName.add("figs");
	itemName.add("grapefruit");
	itemName.add("honeydew");
	return itemName;
}
public static ArrayList<Double> listOfPrices(){
	ArrayList<Double> itemPrice = new ArrayList<>();
	itemPrice.add(0.99);
	itemPrice.add(0.59);
	itemPrice.add(1.59);
	itemPrice.add(2.19);
	itemPrice.add(1.79);
	itemPrice.add(2.09);
	itemPrice.add(1.99);
	itemPrice.add(3.49);
	return itemPrice;
}
public static void printMenu(ArrayList<String> name, ArrayList<Double> price) {

	
	for (int i = 0; i < name.size(); i++) {
		System.out.println( name.get(i) + " "  + price.get(i));

	}


}
}