package Array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println(" Enter the number of student");
	     num = sc.nextInt();
	    double arr[]=new double[num];
	    System.out.println(" Enter the height of students");
	    for(int i=0;i<num;i++)
	    {
	    	arr[i]=sc.nextDouble();
	    }
	   
	    double small;
	    for(int i=0;i<num;i++)
	    { 
	        for(int j=i+1;j<num;j++)
	         {
	        	if(arr[i]>arr[j])
	       		 {  
	              small=arr[i];
	         	  arr[i]=arr[j];
	          	  arr[j]=small;
	             }
	        }
	      }
	    for(int i=0;i<num;i++)
	    {
	    	System.out.println(arr[i]);
	    }
		
	}

}
