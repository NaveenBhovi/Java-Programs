package Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		int y;
		System.out.println("Enter any year");
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("leaf year");
		}
		else
		{
			System.out.println("not a leaf year");
		}

	}

}
