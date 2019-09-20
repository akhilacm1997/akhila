package leapyear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		if((num%400==0)||(num%100!=0 &&num%4==0))
		{
			System.out.println("it is a year");
		}
		else
			System.out.println("it is  not a year");
	}

}
