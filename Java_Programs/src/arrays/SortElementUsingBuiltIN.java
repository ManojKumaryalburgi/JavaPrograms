package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortElementUsingBuiltIN {

	public static void main(String[] args) {
		int a[]= {1,20,2,40,60};
		//approach1
		System.out.println("Approach 1 :");
		System.out.println("element before sorting :"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("element After sorting :"+Arrays.toString(a));
		System.out.println("====================================================");
		//approach2
		System.out.println("Approach 2  :");
		int b[]= {1,20,2,40,60};
		System.out.println("element before sorting :"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("element After sorting :"+Arrays.toString(b));
		System.out.println("===================================================");
		//toDesending order
		System.out.println("Desending Order :");
		Integer c []= {1,2,3,4,5};
		
		System.out.println("element before sorting :"+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("element After sorting :"+Arrays.toString(c));
		
	}

}
