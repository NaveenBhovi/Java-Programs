package Programs;

import java.util.Scanner;

public class ReverseStatement {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter a String....");
		String str=sc.nextLine();
		String[]rst=str.split("");
		for(int i=rst.length-1;i>=0;i--)
		{
			
			System.out.print(rst[i]+"");
			
		}
		

	}

}
