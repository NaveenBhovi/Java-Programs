package Programs;

import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) 
	{
		String []arr1= {"js", "jdbc", "hibernate", "spring","java","html","css"};
		String []arr2= {"java","sql","html","css"};
		
		HashSet<String>hs=new HashSet<>();
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
					break;
					
				}
			}
		}
		for(String no:hs)
		{
			System.out.println(no+"");
		}
		

	}

}
