package practicePkg;

import java.util.Arrays;
import java.util.List;

public class Practice1 {
	
	// Find out the sum of all even number square using java 8
	
	public static void sumOfEven(List<Integer> l1) {
		
		Integer sum = l1.stream().filter(a->a%2==0).map(a->a*a).reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
	
	
}
