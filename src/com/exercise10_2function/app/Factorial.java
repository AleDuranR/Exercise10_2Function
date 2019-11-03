package com.exercise10_2function.app;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// Variables
		long factorial = 1;
		int number = -1;
		// Object construction
		Scanner scan = new Scanner(System.in);
		
		// Validation
		do {
			System.out.println("Number to calculate factorial ");
			number = scan.nextInt();
			if(number <= 0) {
				System.out.println("You must input a positive value");
			}
			
		}while(number < 0);
		
		factorial = GiveFactorial(number);
		System.out.format("The \"factorial\" of %d is %d, \nwhich is gotten by multiplying several times %d",number,factorial, number);
		scan.close();
	}
	// Method 'GiveFactorial' 
	public static long GiveFactorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n;i++) {
			factorial = factorial*i;
		}
		return factorial;
	}
	public static long GiveFactorial(double n) {
		return 0;
	}

}
