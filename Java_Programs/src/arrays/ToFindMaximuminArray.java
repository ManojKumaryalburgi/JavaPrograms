package arrays;

public class ToFindMaximuminArray {

	public static void main(String[] args) 
	{
		int a[]= {10,30,40,50,100};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			
		}
		
		System.out.println(max);

	}

}
