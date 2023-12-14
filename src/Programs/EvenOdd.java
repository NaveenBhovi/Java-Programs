package Programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
//		int no=12;
		int y;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		
		
		if(y%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
