package week1.day1;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {
		
		int input, reminder;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		input = sc.nextInt();
		
		
		//input = 11;
		
		reminder = input % 2;
		
		if (reminder == 0)
		{
			System.out.println("Even Number.");
		}
		else
		{
			System.out.println("Odd Number.");
		}
		
		sc.close();
		
	}

}
