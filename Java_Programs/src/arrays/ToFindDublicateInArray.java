package arrays;

import java.util.HashSet;

public class ToFindDublicateInArray {

	public static <E> void main(String[] args)
	{
		
		//Approach1
	/*	String s []= {"manoj","gireesh","pasha","madan","samir","manoj"};
		//char c []= {'c','a','m','c'};
		boolean f=false;
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i]==s[j])
				{
					System.out.println("Dublicate Element is there :"+s[i]);
					f=true;
				}
				
			}
			
		}
		if(f=false)
		{
			System.out.println("dublicate element is not there");
		}
	*/
		//approach2
		
		String s[]= {"manoj","gireesh","pasha","madan","samir","manoj"};
		boolean flag=false;
		
		HashSet<String> h = new HashSet();
		
		for (String d : s) 
		{
			if(h.add(d)==false)
			{
				System.out.println("Dublicate Element Found :"+d);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("no Dublicate Element");
		}
	}

}
