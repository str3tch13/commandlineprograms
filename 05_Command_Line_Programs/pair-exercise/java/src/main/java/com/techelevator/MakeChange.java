package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		// prompt user for bill
		System.out.println("Please enter the amount of the bill:" + "\n $");  //how do we make this dollar sign on the same line as the user input?
			Scanner input = new Scanner(System.in);
				String billAmount = input.nextLine();
		
		// prompt user for amount tendered
		System.out.println("Enter the amount tendered:" + "\n $");
				String amountTendered = input.nextLine();
				
		
		// code to figure change
				double change = Double.parseDouble(amountTendered) - Double.parseDouble(billAmount);
				
				if (change < 0) {
					
					System.out.println("Not enough payment!");
				
				} 
				
				if (change > 0) {
				
				
					System.out.format("The change required is: $" + "%.2f", change);
		
				}
				
				if (change == 0) {
					
					System.out.println("Exact change entered.\nThank you for your payment!");
				}
		
				
				
		
		// print change required

	}

}
