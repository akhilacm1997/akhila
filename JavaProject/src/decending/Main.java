package decending;

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
	   
	    int small;
	    for(int i=0;i<num;i++)
	    { 
	        for(int j=i+1;j<num;j++)
	         {
	        	if(arr[i]<arr[j])
	       		 {  
	              small=arr[i];
	         	  arr[i]=arr[j];
	          	  arr[j]=small;
	             }
	        }
	      }
	    System.out.println("The priority of marks is");
	    for(int i=0;i<num;i++)
	    {
	    	System.out.println(arr[i]);
	    }
		
	}



	}


