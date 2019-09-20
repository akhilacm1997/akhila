package cricket1;

import java.util.Scanner;

public class Cricket1 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of applications");
	     num = sc.nextInt();
	    int place[]=new int[num];
	    System.out.println("Enter the number of fouls made by each player");
	    for(int i=0;i<num;i++)
	    {
	    	place[i]=sc.nextInt();
	    }
	    int great =place[0];
	    for(int i=1;i<num;i++)
	    {
	    	if(great>place[i])
	    	{
	    		great=place[i];
	    	}
	    }
	    System.out.println(great);
	    int m = 0;
	    for(int i=0;i<num;i++)
	    {
	    	if(great==place[i])
	    	{
	    		m=i;
	    		System.out.println("The eligible player is player no:"+m+1);
	    		break;
	    	}
	    }
	    
	    
	}

}
