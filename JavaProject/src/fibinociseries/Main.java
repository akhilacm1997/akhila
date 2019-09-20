package fibinociseries;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		 System.out.println(n1);
		 System.out.println(n2);
		int p1;
		
		for(int i=0;i<=num;i++)
		{
			 p1=n1+n2;
			System.out.println(p1);
			n1=n2;
			n2=p1;
			
		}
		
	}

}
