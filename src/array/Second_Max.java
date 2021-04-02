package array;

import java.util.Arrays;

public class Second_Max {

	public static void main(String[] args) 
	{
		//int a[] = {11,48,74,2,45,72,98,1,88,45};
		int a[] = {11,48,74};
		

		for(int i : a)
		{
			System.out.print(i+",");
		}
		System.out.println("\n----------------------------");
		int temp = a[0];
		
		for(int i = 0; i<a.length;i++)
		{
			System.out.println("i = "+i);
			for(int j = i+1; j<a.length;j++)
			{
				System.out.println("j = "+j);
				System.out.println("a[i] = "+ a[i] +" > b[j] = "+a[j]);
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("----------------------------");
		for(int i : a)
		{
			System.out.print(i+",");
		}
		System.out.println("Max element : "+ a[a.length-2]);
	}
}
