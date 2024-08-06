package Java8_Practice;

import java.util.Arrays;
import java.util.List;

public class Main_Drive {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,55,23,8,7,8,9,2,2,2,4);
		System.out.println(Problemss_Solution.findMaxFromList(list));
		System.out.println("Sum of all Even Number is " +Problemss_Solution.findSumEven(list));

		
	}

}
