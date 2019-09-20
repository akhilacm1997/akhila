package retest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int count =0;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of students");
	     num = sc.nextInt();
	    int arr[]=new int[num];
	    System.out.println("Enter the marks of students");
	    for(int i=0;i<num;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<num;i++)
	    {
	    	if(arr[i]<15)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println("Number of students appearing for retest is "+count);
	}

}
