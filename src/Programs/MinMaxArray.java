package Programs;

public class MinMaxArray {

	public static void main(String[] args) 
	{
		int a[]= {50,60,30,40,70};
		int max=a[0];
		int min=a[1];
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
			
		}
		

	}

}
