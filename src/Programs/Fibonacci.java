package Programs;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c;
		System.out.println(a+""+b);
		for(int i=1; i<=5; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
