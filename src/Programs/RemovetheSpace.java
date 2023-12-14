package Programs;

public class RemovetheSpace {

	public static void main(String[] args)
	{
		String str="Hey My Name Is Prince";
		System.out.println("Before removing the Space:"+str);
		str=str.replaceAll("\\s","");
		System.out.println("After Removing the Space:"+str);
		
		

	}

}
