package array;

public class Array_Min_Max {

	public static void main(String[] args) 
	{
		int a[] = {11,48,74,2,45,72,98,1,74,45};
		
		int min = a[0];
		int max = a[0];
		
		for(int i = 0; i<a.length;i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
			
			if(max < a[i])
			{
				max = a[i];
			}
		}

		System.out.println("Min element : "+ min);
		System.out.println("Max element : "+ max);
	}

}
