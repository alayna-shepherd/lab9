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
		String userCont;
	 //display menu
		System.out.println("Welcome to Geunther's market!");
		printMenu(itemName, itemPrice);
		
	
		
		//ask user for item from menu and add to cart if possible
		do {
		System.out.println("What item would you like to order?");
		String itemOrdered = scan.nextLine();
		
	
		if (itemOrdered.equalsIgnoreCase("banana")) {
			orderName.add("banana");
			orderPrice.add(0.59);
			System.out.println("banana has been added to your order for $0.59");
		} else if (itemOrdered.equalsIgnoreCase("apple")) {
			orderName.add("apple");
			orderPrice.add(0.99);
			System.out.println("apple has been added to your order for $0.99");
		} else if (itemOrdered.equalsIgnoreCase("cauliflower")) {
			orderName.add("cauliflower");
			orderPrice.add(1.59);
			System.out.println("cauliflower has been added to your order for $1.59");
		} else if (itemOrdered.equalsIgnoreCase("dragonfruit")) {
			orderName.add("dragonfruit");
			orderPrice.add(2.19);
			System.out.println("dragonfruit has been added to your order for $2.19");
		} else if (itemOrdered.equalsIgnoreCase("elderberry")) {
			orderName.add("elderberry");
			orderPrice.add(1.79);
			System.out.println("elderberry has been added to your order for $1.79");
		} else if (itemOrdered.equalsIgnoreCase("figs")) {
			orderName.add("figs");
			orderPrice.add(2.09);
			System.out.println("figs has been added to your order for $2.09");
		} else if (itemOrdered.equalsIgnoreCase("grapefruit")) {
			orderName.add("grapefruit");
			orderPrice.add(1.99);
			System.out.println("grapefruit has been added to your order for $1.99");
		} else if (itemOrdered.equalsIgnoreCase("honeydew")) {
			orderName.add("honeydew");
			orderPrice.add(3.49);
			System.out.println("honeydew has been added to your order for $3.49");
			
			//display error
		} else {
			System.out.println("Sorry, we dont have those! Please try again.");
		} 
		//ask if user wants to add another
		System.out.println("would you like to order anything else? (y/n)");
		 userCont = scan.nextLine();
		}while (userCont.equalsIgnoreCase("y"));
			
		System.out.println("Thanks for your order!");
		System.out.println("Heres what you got:");
				printMenu(orderName,orderPrice);
		
		
		
	}
		


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
}
	
	
	public static int totalPrice(int[] orderPrice) {
		int sum = 0;
		
		for(int i = 0; i < orderPrice.length; i++) {
			sum += orderPrice[i];
			
		}
		return sum;
	}



}
