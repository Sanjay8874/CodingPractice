package LeetCode;
import LeetCode.Solutions;

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
		
		System.out.println(Solutions.lengthOfLastWord(s1));
		
	
	}

}

