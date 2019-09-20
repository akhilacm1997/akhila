package cricket;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of bowlers");
	     num = sc.nextInt();
	    double ball[]=new double[num];
	    double run[]=new double[num];
	    System.out.println("Enter the number of balls for each bowler");
	    for(int i=0;i<num;i++)
	    {
	    	ball[i]=sc.nextInt();
	    }
	    System.out.println("Enter the runs conceded by the bowlers");
	    for(int i=0;i<num;i++)
	    {
	    	run[i]=sc.nextInt();
	    }
	    for(int i=0;i<num;i++)
	    {
	      ball[i]=ball[i]/6;
	    }
	    for(int i=0;i<num;i++)
	    {
	    run[i]=run[i]/ball[i];
	    }
	    System.out.println("Economy of the bowlers is");
	   
	    for(int i=0;i<num;i++)
	    {
	    	
	     System.out.println(run[i]);
	    }
	    double sum=0;
		   for(int i=0;i<num;i++)
		    {
			   sum=sum+run[i];
		    }
		    double r=sum/num;
		   System.out.println("The overall economy of the teanm is"+r);
		   int count =0;
		    for(int i=0;i<num;i++)
		    {
		    	if(run[i]>=r)
		    	{
		    		count++;
		    	}
		    }
		   System.out.println("The number of bowlers eligible are "+count);   
	}

}
