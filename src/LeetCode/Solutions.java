package LeetCode;

import java.util.*;

public class Solutions {
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

    // 189. Rotate Array
    public static void rotate(int[] nums, int k) {

        int l = nums.length;

        // 1. Reverse Entire array
        reverse(nums, 0, l - 1);

        // 2. Reverse first k element in array

        reverse(nums, 0, k - 1);

        // 3. Reverse from k to n-1

        reverse(nums, k, l - 1);

    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Reverse array

    // 2011. Final Value of Variable After Performing Operations
    public static int finalValueAfterOperations(String[] operations) {

        int X = 0;
        for (String str : operations) {
            if (str.equals("X++") || str.equals("++X")) {
                X += 1;
            } else if (str.equals("X--") || str.equals("--X")) {
                X -= 1;
            }

        }

        return X;
    }

    public static boolean repChar(String str) {
        Set<Character> seenCharacters = new HashSet();
        for (char ch : str.toCharArray()) {
            if (!seenCharacters.add(ch)) {
                return true;
            }
        }
        return false;
    }

    // Find allsubString
    public static List<String> findAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        // Loop to generate all possible substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }

    // Check repeted Char in String

    // 1512. Number of Good Pairs
    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (freq.containsKey(num)) {
                count += freq.get(num);
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        return count;
    }

    // 5. Longest Palindromic Substring
    public static String longestPalindrome(String s) {
        // Steps-->
        // 1.Find the substring
        List<String> listSubStrings = Solutions.findAllSubstrings(s);

        // 2.Find List of String Palindrome
        List<String> listPList = new ArrayList<String>();
        for (String str : listSubStrings) {
            if (isPalindrome(str)) {
                listPList.add(str);
            }

        }

        // 3. find length of each Palindrome String and store it into Map
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String str : listPList) {
            map.put(str, str.length());
        }

        // Find max length of String
        String maxLengthString = null;
        int maxLength = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxLength) {
                maxLength = entry.getValue();
                maxLengthString = entry.getKey();
            }
        }

        return maxLengthString;

    }

    // palindrome String
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(Integer x) {

        String xString = x.toString();

        StringBuilder stringBuilder = new StringBuilder(xString);

        if (stringBuilder == stringBuilder.reverse()) {
            return true;
        } else {
            return false;
        }

    }

    // 771. Jewels and Stones
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set1 = new HashSet<Character>();

        for (char c : jewels.toCharArray()) {
            set1.add(c);
        }

        for (char s : stones.toCharArray()) {
            if (set1.contains(s)) {
                count++;
            }
        }

        return count;

    }

    // 9. Palindrome Number

    //2942. Find Words Containing Character
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();

        int length = words.length;
        for (int i = 0; i < length; i++) {
            for (char y : words[i].toCharArray()) {

                if (y == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

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

    // 3. Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring(String s) {

        List<String> listSubStrings = Solutions.findAllSubstrings(s);
        TreeSet<Integer> legthSet1 = new TreeSet();

        for (String s1 : listSubStrings) {
            int length = s.length();
            legthSet1.add(length);
        }

        for (String string : listSubStrings) {
            boolean repChar = Solutions.repChar(string);
            if (repChar == false && string.length() >= legthSet1.last()) {
                return legthSet1.last();
            }
        }

        return legthSet1.last();

    }


}
