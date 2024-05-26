package Problems;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.rowset.JoinRowSet;

public class Problemss {

	public static void fabbo(int n) {

		int first = 0;
		int second = 1;
		if (n <= 0) {
			System.out.println("number less then 0");
		}

		if (n == 1) {
			System.out.println(first);
		} else if (n == 2) {
			System.out.println(second);

		}

		if (n > 2) {
			int sum = 0;
			for (int i = 3; i <= n; i++) {

				sum = first + second;
				first = second;
				second = sum;

			}
			System.out.println(sum);
		}

	}

	public static void removeWhiteSpace(String s) {

		String newString = s.replaceAll("\\s+", "");

		System.out.println(newString);
	}

	// check two array are the Same

	public void eqaualArray(int[] a, int[] b) {

		boolean result = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					result = false;
				}
			}

		} else {
			result = false;
		}

		if (result) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

	}

	public String defangIPaddr(String address) {
		String newAddressString = address.replaceAll("\\.", "[.]");
		;

		return newAddressString;
	}

	// Frequency of each element in array using for loop

	public void frequency(int[] array) {
		int l = array.length;

		for (int i = 0; i < l; i++) {
			int count = 1;
			if (array[i] == -1) {
				continue;
			}

			for (int j = i + 1; j < l; j++) {
				if (array[i] == array[j]) { // int[] array = {2,4,5,6,7,8,3,2,2,2,2};
					count++;
					array[j] = -1;

				}
			}
			System.out.println(array[i] + " - " + count);
		}

	}

	// Frequency of each element in array using HashMap

	public Map<Integer, Integer> countFrequency(int[] nums) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		return frequencyMap;
	}

	// Find the duplicate element using for loop

	public List<Integer> findDuplicate(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && !list.contains(arr[i])) {

					list.add(arr[i]);
				}
			}
		}
		return list;
	}

	// Find the duplicate element using Set

	public static List<Integer> findDuplicates(int[] nums) {
		Set<Integer> seen = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();

		for (int num : nums) {
			if (!seen.add(num)) { // If element already exists in set, add to duplicates list
				duplicates.add(num);
			}
		}
		return duplicates;
	}

	// Remove duplicate from the Arrays
	public Set<Integer> removeDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}
		return set;
	}

	// Remove duplicate from List
	public Set<Integer> removeDuplicate1(List<Integer> list1) {

		Set<Integer> set = new HashSet<>(list1);

		Set<Integer> set1 = new TreeSet<Integer>(list1);
		return set1;
	}

	// Find the element which is more than 2

	public List<Integer> frequencyIntegersOfElements(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		List<Integer> list = new ArrayList<>();

		for (int arr1 : arr) {

			map.put(arr1, map.getOrDefault(arr1, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				list.add(entry.getKey());
			}
		}
		return list;

	}

	public Character firstNonRepeatedChar(String s) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}

	// Remove Duplicate from the Array and print the array using for Loop
	public int[] removeDuplicate1(int[] array) {

		int length = array.length;
		int[] newArray = new int[length];
		int currentIndex = 0;

		for (int i = 0; i < length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < currentIndex; j++) {
				if (array[i] == array[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				newArray[currentIndex++] = array[i];

			}
		}
		return Arrays.copyOf(newArray, currentIndex);
	}

// Remove the duplicate character from String
	public String removeDuplicateChar(String str) {

		Map<Character, Integer> strMap = new ConcurrentHashMap<Character, Integer>();

		for (char chr : str.toCharArray()) {
			strMap.put(chr, strMap.getOrDefault(chr, 0) + 1);
		}

		/*
		 * for(Map.Entry<Character, Integer> entry:strMap.entrySet()) {
		 * if(entry.getValue()>1) { strMap.remove(entry.getKey()); } }
		 */

		StringBuilder stringBuilder = new StringBuilder();
		for (Character ch : str.toCharArray()) {
			if (strMap.get(ch) == 1) {
				stringBuilder.append(ch);
			}
		}
		return stringBuilder.toString();
	}

	// Remove duplicate from array using HashMap
	public Integer[] removeDuplicate2(int[] arr) {

		Map<Integer, Integer> mapData = new HashMap<>();

		for (int i : arr) {
			mapData.put(i, mapData.getOrDefault(i, 0) + 1);
		}

		List<Integer> newList = new ArrayList<>();

		for (int arr1 : arr) {

			if (mapData.get(arr1) == 1) {
				newList.add(arr1);
			}
		}

		Integer[] newArray = newList.toArray(new Integer[newList.size()]);
		return newArray;
	}
	
	
	
	// check Expression is valid or not
	public boolean checkValidString(String str) {
		
		Stack<Character> stack = new Stack();
		for(char ch : str.toCharArray()) {
			if(ch=='(') {
				stack.push(ch);
			}
			else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
					
				}
				
				stack.pop();
			}
			
		}
		
		return stack.isEmpty();
	}
	
	// Find Large element in array
	
	public int secondLarge(int[] arr) {
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		
		return max;
			
	}
	
	

}
