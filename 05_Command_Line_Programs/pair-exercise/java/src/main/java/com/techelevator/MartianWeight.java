package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		
		// Prompt the user to put in data
		
		System.out.println("Enter a series of Earth weights (space-separated): ");
		
		// Create scanner and read user input
		
		Scanner input = new Scanner(System.in);
		String userWeightInputs = input.nextLine();
		
		// separate user input into individual strings
		
		String [] strWeightArray = userWeightInputs.split(" ");
		
		// parse individual strings into doubles
		
		int sizeOfStringArray = strWeightArray.length;
		
		int [] intWeightArray = new int [sizeOfStringArray];  //format for new array: datatype[] identifier = new datatype[size of the array]
		
		for (int i = 0 ; i < sizeOfStringArray ; i++) {
			
			intWeightArray[i] = Integer.parseInt(strWeightArray[i]);
			
		}
		
		for (int i = 0 ; i < sizeOfStringArray ; i++) {
			
			System.out.println(intWeightArray[i] + " lbs. on Earth is " + (int)(intWeightArray[i] * 0.378) + " on Mars.");
			
			//98 lbs. on Earth, is 37 lbs. on Mars.
			//Wm = We * 0.378
			
		}
		// convert individual converted strings into martian wieght
		// print user input * martian formula

	}

}
