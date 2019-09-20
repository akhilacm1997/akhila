package average;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of students");
	     num = sc.nextInt();
	    int arr[]=new int[num];
	    System.out.println("Enter the marks of students");
	    for(int i=0;i<num;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	   int sum=0;
	   for(int i=0;i<num;i++)
	    {
		   sum=sum+arr[i];
	    }
	   int avg = sum/num;
	   System.out.println("The average is "+avg);
	   
			   
	}

}
