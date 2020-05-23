package arrays;

public class ToFindSecondMaxinArray {

	public static void main(String[] args) 
	{
		int []d= {12,30,40,50,60,80};
		int temp,size;
		size=d.length;
		
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size-1; j++)
			{
				if(d[j]>d[j+1])
				{
					 temp=d[j];
					d[j]=d[j+1];
					d[j+1]=temp;
				}
				
			}
			
		}
		
		System.out.println("second maximum number in array is :"+d[size -2]);
		
		

	}

}
