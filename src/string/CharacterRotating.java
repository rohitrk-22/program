package string;
import java.util.Scanner;

public class CharacterRotating {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.next();
		
		//System.out.println("s1.length() : "+s1.length());
		char[] arr = s1.toCharArray();
		
		for(int i=0; i < arr.length; i++)
		{
			int index = i;
			//System.out.println("index/i : "+i);
			//System.out.println("-------- START :: J loop ------------");
			for(int j = 0; j < arr.length; j++)
			{
				//System.out.println("j : "+j);
				//System.out.println("arr[index] : "+arr[index]);
				System.out.print(arr[index]);
				index++;
				//System.out.println("After increament index : "+index);
				//index = index% s1.length();
				index = index% 4;
				//System.out.println("After mod index : "+index);
			}
			
			System.out.println();
			//System.out.println("-------- END :: J loop ------------");
		}
		sc.close();
	}
}
