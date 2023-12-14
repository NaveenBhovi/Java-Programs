package Programs;

public class CountVowel {

	public static void main(String[] args) 
	{
		String str="Naveen";
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'||ch=='u')
			{
				System.out.println(ch);
				count++;
			}
		}
		
		System.out.println(count);
		
			} 
		

	}


