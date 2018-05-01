package access;

import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args)
	{
      int i;
      int n;
      int sum=0,avg;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter marks obtained in 5 subjects");
      for(i=0;i<5;i++)
      {
    	  n=sc.nextInt();
    	  sum=sum+n;
      }
      avg=sum/5;
      System.out.println("your grade is:");
      if(avg>80)
      {
    	  System.out.println("A");
      }
      else if(avg>60 && avg<=80)
      {
    	  System.out.println("B");
      }
      else if(avg>40 && avg<=60)
      {
    	  System.out.println("C");
    	  
      }
      else
      {
    	  System.out.println("D");
      }


	}

}
