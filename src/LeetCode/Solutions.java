package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.border.MatteBorder;

public class Solutions {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;

		int[] prefixProducts = new int[n];
		int[] suffixProducts = new int[n];

		prefixProducts[0] = 1;
		for (int i = 1; i < n; i++) {
			prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
		}

		suffixProducts[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			suffixProducts[i] = suffixProducts[i + 1] * nums[i + 1];
		}

		// Calculate final result
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = prefixProducts[i] * suffixProducts[i];
		}

		return result;
	}

	public static int findPermutationDifference(String s, String t) {
		
		String[] s1 = s.split("");
		String[] t1 = t.split("");
		
		int l1 = s1.length;
		int l2 = t1.length;
		int sum = 0;
		
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(s1[i].equals(t1[j])) {
					sum = Math.abs(sum + Math.abs(i-j));
					
					
				}
				
			}
		}
		
		return sum;
	}
	
	
	
	 //2053. Kth Distinct String in an Array
	 public static String kthDistinct(String[] arr, int k) {
		 
		 Map<String, Integer> mapStr = new HashMap<String, Integer>();
		 
		 for(String str : arr) {
			 
			 mapStr.put(str, mapStr.getOrDefault(str, 0)+1);
			 
		 }
		 
	
		 List<String> list = new ArrayList<String>();
		 
		 for(String s : arr) {
			 if(mapStr.get(s)==1) {
				 list.add(s);
			 }	
		 }
		 if(k>list.size()) {
			 return "";
		 }
		 else {
			return list.get(k-1);
		}
	        
	      
	    }
}
