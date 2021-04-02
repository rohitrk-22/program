package string;

public class Sun 
{
	public static void main(String[] args) {
		
	String str = "Sun Rises In East";
	
	String[] words = str.split(" ");
	
	System.out.println("-------------Output-1-----------");
	for (int i = 0; i < words.length; i++) {
		System.out.print(words[i]+words[i].length()+" ");
	}
	System.out.println();
	
	System.out.println("---------output-2--------");
	
	for(int i = 0; i <words.length; i++)
	{
		char[] charArr = words[i].toCharArray();
		
		for(int j = charArr.length-1; j >= 0; j--)
		{
			System.out.print(charArr[j]);
		}
		System.out.print(" ");
	}
	System.out.println();
	System.out.println("------ output 3----------");
	
	for(int i = words.length-1; i >= 0; i--)
	{
			System.out.print(words[i] +" ");
	}
	
	System.out.println("\n------- output 4----------");
	String temp = words[0];
	words[0] = words[words.length-1];
	words[words.length-1] = temp;
	
	for(int i = 0; i <words.length ; i++)
	{
			System.out.print(words[i] +" ");
	}
	
	System.out.println("\n------- output 5----------");
	
	for(int i = 0; i <words.length ; i++)
	{
		if(i == 0 || i == words.length-1)
		{
			char[] charArr = words[i].toCharArray();
			
			for(int j = charArr.length-1; j >= 0; j--)
			{
				System.out.print(charArr[j]);
			}
		}
		else
		{
			System.out.print(words[i]);
		}
		System.out.print(" ");
	}
	
	
	}
}
