package vechicle;

import java.util.Scanner;

public class Vechicle {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.println(" Enter vechicle ");
	     num = sc.nextInt();
	    int arr[]=new int[num];
	    System.out.println(" ");
	    for(int i=0;i<num;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	
	int count =0;
	int count1=0;
    
	for(int i=0;i<num;i++)
    {
		if(arr[i]>50)
		{
			count++;
		}
		else
		{
			count1++;
		}
    }
	 System.out.println("Number of heavy vehicles "+count+" and the number of light weight vehicles is"+ count1);
	}
}



