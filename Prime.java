package week1.day1;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int input;
		System.out.println("Enter input to find Prime or Not Prime : ");
		input = sc.nextInt();
		
		//999999937 - Prime Number
		
		//int input = 17;
		boolean prime = true;
		
		
		for (int i = 2; i<input ;i++)			
		{
			if ((input%2) == 0)		
				prime = false;
			
		}
		
		if (prime == true)
			System.out.println(input + " is a Prime Number.");
		else
			System.out.println(input + " is Not a Prime Number.");
		
		sc.close();
	}

}
