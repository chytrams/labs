package lab1;

import java.util.Scanner;

public class exrc2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter option 'red' or 'yellow' or 'green' ");
		
		String option= sc.nextLine();
	
		switch(option)
		{
		    case "red":
		      System.out.println("STOP");
		      break;
		   
		   case "yellow":
			   System.out.println("BE READY");
		      break;
		      
		   case "green":
			   System.out.println("GO");
			      break;
		   
		}

	}

}
