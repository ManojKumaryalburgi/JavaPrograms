package arrays;

public class ToFindSecondMininArray {

	public static void main(String[] args) {
		
		int c []= {23,12,34,50,98,6};
		int size;
		size=c.length;
		
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size-1; j++) 
			{
				int temp=0;
				if(c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
				
			}
			
		}
		
		
			System.out.println("second minimum element in Array is :"+c[1]);
			
		

	}

}
