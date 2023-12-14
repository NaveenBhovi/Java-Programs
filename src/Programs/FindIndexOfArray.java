package Programs;

public class FindIndexOfArray {

	public static void main(String[] args) 
	{
		String[]a= {"Black","White","Green","Blue","Orange","pink"};
//		int[]a= {2,3,6,5,7,9,0,6,8,1,2};
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]=="Orange")
			{
				index=i;
			}
		}
			System.out.println("Index="+index);
	}

}
