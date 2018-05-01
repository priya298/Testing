package access;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args)
	{
		float a,b,res;
		char choice, ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1 addition");
			System.out.println("2 subtraction");
			System.out.println("3 multiplication");
			System.out.println("4 divisoin");
			System.out.println("5 exit");
			System.out.println("enter your choice");
			choice=sc.next().charAt(0);
            switch(choice)
		    {
		     case '1':
		    	 System.out.println("enter two numbers");
		    	 a=sc.nextFloat();
		    	 b=sc.nextFloat();
			     res=a+b;
			     System.out.println("Result =" + res);
			     break;
			     
		     case '2':
		    	 System.out.println("enter two numbers");
		    	 a=sc.nextFloat();
		    	 b=sc.nextFloat();
		    	 
		   
		    }
            
		
		}     
		     
		
	


		
		
	

		
		

	


