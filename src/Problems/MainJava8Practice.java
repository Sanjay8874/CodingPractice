package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainJava8Practice {

	public static void main(String[] args) {
		
		// find even number 
		
		List<Integer> list1 = Arrays.asList(1,2,34,56,72,5,90,11,111,11,21,121);
		
		List<Integer> l1 =list1.stream().filter(even->even%2==0).collect(Collectors.toList());
		System.out.println(l1);

		List<String> str1 =list1.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(str1);
		
		//Find Duplicate elements using 
		
		List<Integer> originalList = Arrays.asList(2,3,4,5,1,2,3,4,5,6,7,8);
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> l2 =originalList.stream().filter(s->!set.add(s)).collect(Collectors.toList());
		System.out.println(l2);
		
		// Find the first element in List
		originalList.stream().findFirst().ifPresent(System.out::println);
		
		 //Find the Max number present in the List
		
		int d= originalList.stream().max(Integer::compare).get();
		System.out.println(d);
		
		
		
	}

}
