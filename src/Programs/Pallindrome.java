package Programs;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args)
	{
//		int=121;
//		int temp=no;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int no=sc.nextInt();		
		
		int rev=0,rem;
		int temp = 0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(no==rev)
		{
			System.out.println(no+"is a pallindrome");
		}
		else
		{
			System.out.println(no+"is not a pallindrome");
		}
	}

}
