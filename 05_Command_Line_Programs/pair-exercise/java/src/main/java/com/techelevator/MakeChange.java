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
		System.out.println("Please enter the amount of the bill:");
			Scanner input = new Scanner(System.in);
				String billAmount = input.nextLine();
		
		// prompt user for amount tendered
		System.out.println("Enter the amount tendered:");
				String amountTendered = input.nextLine();
				
		
		// code to figure change
				double change = Double.parseDouble(amountTendered) - Double.parseDouble(billAmount);
		System.out.format("%.2f", change);
		
				
				
		
		// print change required

	}

}
