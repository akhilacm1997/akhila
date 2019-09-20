package Resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	
	
public static void main(String[] args) throws IOException {
	 String Name;
	 String  Age;
	 String Branch;
	 String Contact;
	 String i;
	 do {
	 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter your details");
	  System.out.println(" Enter your Name");
	  Name = br.readLine();
	  System.out.println(" Enter your Age");
	  Age = br.readLine();
	  System.out.println(" Enter your Branch");
	  Branch = br.readLine();
	  System.out.println(" Enter your Contact");
	  Contact = br.readLine();
	
	  Resume m = new Resume(Name,Age,Branch,Contact);
	  System.out.println("Do you want to enter another person details ? (yes/no)");
	  i=br.readLine();
	  
	
	}while(i.equalsIgnoreCase("yes"));


}
}
