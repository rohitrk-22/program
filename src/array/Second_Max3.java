package array;
public class Second_Max3 {

	public static void main(String[] args) 
	{
		int a[] = {11,88,74,2,45,72,98,1,74,45};
		
		int max = a[0];
		int secondLar = 0;
		int sub = 0;
		for(int i :a)
		{
			if(max < i)
				max = i;
		}
		
		System.out.println("Max num = "+ max);
		
		sub = max - a[0];
		
		for(int i : a)
		{
			if((max - i) <= sub && i != max)
			{
				sub = max -i;
				secondLar = i;
			}
		}
		
		System.out.println(secondLar);
	}
}
