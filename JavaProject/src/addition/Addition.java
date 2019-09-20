package addition;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int num;
		do {
			
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
	     num = sc.nextInt();
		}
	    while(num<0);
	     int sum = 0;
	     for(int i=num;i>0;i--)
	     {
	    	 sum=sum+i;
	     }
	     System.out.println(sum);
	}

}
