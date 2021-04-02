package array;

import java.util.Arrays;

public class Second_Max1 {

	public static void main(String[] args) 
	{
		int a[] = {11,48,74,2,45,72,98,1,88,45};

		int firstMax = 0;
		int secondMax = 0;
		
		for(int i = 0; i<a.length;i++)
		{
			if(firstMax < a[i])
			{
				secondMax = firstMax;
				firstMax = a[i];
			}
			else if(secondMax < a[i])
			{
				secondMax = a[i];
			}
		}

		System.out.println("Second Max element : "+ secondMax);
	}
}
