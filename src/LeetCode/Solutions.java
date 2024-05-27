package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {
				if (s1[i].equals(t1[j])) {
					sum = Math.abs(sum + Math.abs(i - j));

				}

			}
		}

		return sum;
	}

	// 2053. Kth Distinct String in an Array
	public static String kthDistinct(String[] arr, int k) {

		Map<String, Integer> mapStr = new HashMap<String, Integer>();

		for (String str : arr) {

			mapStr.put(str, mapStr.getOrDefault(str, 0) + 1);

		}

		List<String> list = new ArrayList<String>();

		for (String s : arr) {
			if (mapStr.get(s) == 1) {
				list.add(s);
			}
		}
		if (k > list.size()) {
			return "";
		} else {
			return list.get(k - 1);
		}

	}

	public static int lengthOfLastWord(String s) {

		char[] chr = s.toCharArray();

		int l = chr.length;
		int length = 0;

		for (int i = l - 1; i >= 0; i--) {

			if (chr[l - 1] == ' ' || chr[i] == ' ') {
				length = Math.abs(l - i - 1);
				break;

			}

		}
		return length;
	}
	
	
	//189. Rotate Array
    public static void rotate(int[] nums, int k) {
    	
    	int l = nums.length;
    	
    	//1. Reverse Entire array
    	reverse(nums, 0, l-1);
    	
    	//2. Reverse first k element in array
    	
    	reverse(nums, 0, k-1);
    	
    	// 3. Reverse from k to n-1
    	
    	reverse(nums, k, l-1);
    	      
    }
    
   // Reverse array
    
    public static void reverse(int[] arr, int start, int end) {
    	
    	while(start<end) {
    		int temp = arr[start];
    		arr[start] = arr[end];
    		arr[end] = temp;	
    		start++;
    		end--;
    	}
    }
    
    //2011. Final Value of Variable After Performing Operations
    public static int finalValueAfterOperations(String[] operations) {
    	
    	int X=0;
        for(String str: operations){
            if(str.equals("X++") || str.equals("++X")) {
            	X+=1;
            }
            else if(str.equals("X--") || str.equals("--X")) {
            	X-=1;
			}

        }
        
        return X;
    }

}
