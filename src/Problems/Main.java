package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Problemss.fabbo(5);
		
		String s = "Hello I am Sanjay Yadav";
		//Problemss.removeWhiteSpace(s);
		
		int[] a= {1,2,34,5,6,7};
		int[] b= {1,2,34,5,6,71,3};
		
		Problemss p1 = new Problemss();
		//p1.eqaualArray(a, b);
 
		
		String ip = "1.1.1.1";
		//System.out.println(p1.defangIPaddr(ip));
		
		
		int[] array = {1,1,2,3,4,5,6,5,4,3};
		//p1.frequency(array);
		//System.out.println(p1.countFrequency(array));
		
		//System.out.println(p1.findDuplicate(array));

		//System.out.println(p1.findDuplicates(array));
		
		
		//System.out.println(p1.frequencyIntegersOfElements(array));
		
		String string = "sdfsdlk3kk";
		
		//System.out.println(p1.firstNonRepeatedChar(string));
		
		List<Integer> list = Arrays.asList(10,1,11,1,2,3,4,5,5);
		System.out.println(p1.removeDuplicate1(list));
		
		
		int[] array1 = {0, 1, 1, 2, 3, 5, 6, 0, 0, 1};
		/*
		 * int[] newArray = p1.removeDuplicate1(array1); for(int i:newArray) {
		 * System.out.println(i); }
		 */
		
		
		
		String str1 = "ssaaddrrrttyydsfdsds";
		//System.out.println(p1.removeDuplicateChar(str1));
		
		Integer[] newArray1 = p1.removeDuplicate2(array1);
		
		/*
		 * for(Integer i: newArray1) { System.out.println(i); }
		 */
		
		
		String string2 = "((ABC)DE)";
		//System.out.println(p1.checkValidString(string2));
		
		
		
		int[] arr12 = {20,3,2,3,2,2,2,1,100};
		//System.out.println(p1.secondLarge(arr12));
		
		String str22 = "heloo";
		System.out.println(p1.reverseString(str22));
	}
	
	
	
	
	
	


	
	
}
