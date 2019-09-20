package perfectnumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int num;	
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
	     num = sc.nextInt();
	     int sum =0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum =sum+i;
				
			}
		}
		if(sum==num)
		{
			System.out.println("perfect number");
	  }

}
}

