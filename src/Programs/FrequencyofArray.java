package Programs;

public class FrequencyofArray {

	public static void main(String[] args) 
	{
		int[]arr=new int[] {3,3,3,1,2,5,6};
		int[]fr=new int[arr.length];
		int a=-1;
		for(int i=0; i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1; j<arr.length;i++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]=a;
				}
			}
			if(arr[i]!=a)
				fr[i]=count;
		}
		System.out.println("Element 1 frequency");
		for(int i=0; i<fr.length; i++)
		{
			if(fr[i]!=a)
				System.out.println(arr[i]+"1"+fr[i]);
		}
				}
			
		
		

	}


