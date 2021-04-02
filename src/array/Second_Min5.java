package array;
//WAY-3
public class Second_Min5 {
	public static void main(String[] args) {

		int a[] = { 1,1,1,2, 3, 45, 72, 98, 56, 88, 45 };

		int temp = a[0];

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Smallest element : " + a[a.length - 1]);
		
		for(int i= a.length-1; i>= 0; i--)
		{
			if(a[a.length-1] != a[i])
			{
				System.out.println("Second Smallest element : " + a[i]);
				break;
			}
		}
	}
}
