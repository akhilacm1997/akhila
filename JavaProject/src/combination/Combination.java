package combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		
		int n;	
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the n");
	     n = sc.nextInt();
	     System.out.println("Enter the r");
	    int r=sc.nextInt();
	     int mul=1;
	     int s=n-r;
	     
	     for(int i=1;i<=n;i++)
	     {
	    	 mul=mul*i;
	    	 //System.out.println(mul);
	    	 
	     }
	     int mul1=1;
	     for(int i=1;i<=r;i++)
	     {
	    	 mul1=mul1*i;
	     } 
	     int mul2=1;
	     for(int i=1;i<=s;i++)
	     {
	    	 mul2=mul2*i;
	     } 
	     int result = mul/(mul2*mul1);
	     System.out.println(result);
	}

}
