package strings;

public class Converting_StringToCharacterArray {

	public static void main(String[] args) {
		/*
		 * we can convert string to char array in two ways
		 * 1)toChararray();
		 * 2)charAt(int Index);
		 */
		
		//1 :toCharArray()
		
		String s="manoj";
		
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(c[i]);	
		}
		
		System.out.println("=================================");
		//2 :CharAt()
		
		String s1="madan";
		
		char[] c1 = new char[s1.length()];
		
		for (int i = 0; i < c1.length; i++)
		{
			c1[i]=s1.charAt(i);
			System.out.println(c1[i]);
		}
	
		
	}

}
