package string;

public class ReverseString1 {

	public static void main(String[] args) 
	{
		String s = "Java";
		
		System.out.println("String : "+s );
		char[] charr1 = s.toCharArray();
		
		System.out.print("String after reverse: ");
		for(int i = charr1.length - 1; i>=0; i--)
		{
			System.out.print(charr1[i]);
		}
	}

}
