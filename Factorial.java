package week1.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find Factorial : ");
		int number = sc.nextInt();
		
		
		int i, fact = 1;
		//int number = 5;
		
		for (i =1;i<=number;i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of Number of " + number + " is : " + fact);
		
	    sc.close();
	}

}
