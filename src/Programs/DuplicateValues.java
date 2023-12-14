package Programs;
import java.util.Set;
import java.util.HashSet;
public class DuplicateValues {

	public static void main(String[] args) 
	{
		
		int[] a= {3,4,5,6,2,4,3,8,9,7,3};
		System.out.println("Duplicate elements are");
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]==a[j]))
				{
					System.out.println(a[j]+"");
					
				}
			}
		}
	

	
		}
	}


