package Programs; 

public class Armstrong {

	public static void main(String[] args)
	{
		int no=153;
		int s1=no;
		int length=0;
		while(s1!=0)
		{
			length=length+1;
			s1=s1/10;
		}
		int s2=no;
		int arm=0;
		while(s2!=0)
		{
			int mul=1;
			int rem = s2%10;
			for(int i=1; i<=length; i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			s2=s2/10;
		}
		if(arm==no)
		{
			System.out.println(no+"is Armstrong");
			
		}
		else
		{
			System.out.println(no+"is not Armstrong");
		}

	}

}
