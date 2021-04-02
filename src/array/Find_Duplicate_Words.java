package array;

public class Find_Duplicate_Words {

	public static void main(String[] args) {

		String a[] = {"JAVA","C","C++","JAVA","HTML","SQL"};
		
		System.out.println("Duplicates elemets are:");
		
		for(int i= 0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}