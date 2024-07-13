package LeetCode;

public class LeetCodemain {

	public static void main(String[] args) {
		
		String s = "abcde";
		String t = "edbac";
		
		int sum = Solutions.findPermutationDifference(s, t);
		//System.out.println(sum);
		
		String[] strings = {"d","b","c","b","c","a"};
		int k=2;
		//System.out.println(Solutions.kthDistinct(strings, k));
		
		String s1= "   fly me   to   the moon  ";
		
		//System.out.println(Solutions.lengthOfLastWord(s1));
		
	
		
		int[] arr1 = {1,2,3,4,5,6,7,8};
		
		Solutions.rotate(arr1, 2);

		String[] operations = {"X++","++X","--X","X--"};
		
		//System.out.println(Solutions.finalValueAfterOperations(operations));
		
		
		int[] arr11 = {1,2,3,1,1,3};
		int re = Solutions.numIdenticalPairs(arr11);
		
		
		String s2 = "cbbd";
		//System.out.println(Solutions.longestPalindrome(s2));
		
		Integer i1 = -1214;
		//System.out.println(Solutions.isPalindrome(i1));
		
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(Solutions.numJewelsInStones(jewels, stones));
		
	
	}
	

}

