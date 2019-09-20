package englishword;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number alphabets in your name");
	     num = sc.nextInt();
	     int r=1;
	     for(int i=1;i<=num;i++)
	     {
	    	 r=r*i;
	     }
	     System.out.println("The number of combination is "+r);
	}

}
