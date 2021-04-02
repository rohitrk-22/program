package palindrome;

public class Palindrome2 {

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 1000; i++)
		{
			int temp = i;
			int reverse = 0;
			
			while(temp != 0)
			{
				int digit = temp % 10;
				reverse = (reverse * 10) + digit;
				temp /= 10;
			}
	
			if(i == reverse)
			{
				System.out.println(i +" is palindrome number");
			}
		}
	}
}
