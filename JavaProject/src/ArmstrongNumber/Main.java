package ArmstrongNumber;

import java.util.Scanner;

public class Main {
      int num;
      static int r;
      static int n;
      static int count;
      static int sum=0;
      static int m;
      
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		    int num = sc.nextInt();
		    n=num;
		    m=num;
		    while(n>0)
		    {
		    	r=n%10;
		    	n=n/10;
		    	count++;
		    }
		    
		    while(num>0)
		    {
		    	r=num%10;
		    	sum=sum+pow1(r,count);
		    	num=num/10;
		    }
		  
		   
		    if(m==sum)
			{
				System.out.println("The given number is amstrong");
			}
		    else
		    {
		    	System.out.println("The given number is not amstrong");
		    }
	}
	private static int pow1(int r, int count) 
	{
		int k=1;
	for(int j=0;j<count;j++)
	{
		k=k*r;
		
	}
		return k;
	}

	
}

