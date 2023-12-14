package Programs;

public class DuplicateString {

	public static void main(String[] args) 
	{
		String str="Maheshbabu";
		int lenght=str.length();
		char[] ch=str.toCharArray();
		for(int i=0; i<lenght; i++)
		{
			for(int j=i+1; j<lenght; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate Characters are:"+ch[j]);
					break;
				}
			}
		}

	}

}
