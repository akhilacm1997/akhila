package contract;

import java.util.Scanner;

public class Contract {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of applications");
	     num = sc.nextInt();
	    int place[]=new int[num];
	    System.out.println("Enter the amount(in crores)");
	    for(int i=0;i<num;i++)
	    {
	    	place[i]=sc.nextInt();
	    }
	    int great =place[0];
	    for(int i=1;i<num;i++)
	    {
	    	if(great<place[i])
	    	{
	    		great=place[i];
	    	}
	    }
	    System.out.println("The winning bid is "+great+" cores");
	}

}
