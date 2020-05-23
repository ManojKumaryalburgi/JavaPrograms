package arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {10,30,3,5,78,90};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
			
		}

	}

}
