package Programs;

public class LeafYear1 {

	public static void main(String[] args) 
	{
		int year=2016;
		if(year%4==0)
		{
			if(year%100==0) 
			{
				if(year%400==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("not Leaf year");
				}
			}
			else
			{
				System.out.println("Leaf year");
			}
		}
		else
		{
			System.out.println("not Leaf year");
		}
		
		}

	}


