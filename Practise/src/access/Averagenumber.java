package access;

import java.util.Scanner;

public class Averagenumber {

	public static void main(String[] args)
	{
		int i,j,s;
		int sum=0, avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		i=sc.nextInt();
		j=sc.nextInt();
		s=sc.nextInt();
		System.out.println("entered number "+i+","+j+", "+s+", " );
		System.out.println("sum of all numbers");
		sum=i+j+s;
		System.out.println(sum);
		System.out.println("average of all numbers");
		avg=sum/3;
		System.out.println(avg);

	}

}
