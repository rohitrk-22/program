package array;

public class Find_Duplicate_String {

	public static void main(String[] args) {

		String str = "programming";
		
		char a[] = str.toCharArray();
		
		System.out.println("Duplicates elemets are:");
		
		for(int i= 0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}