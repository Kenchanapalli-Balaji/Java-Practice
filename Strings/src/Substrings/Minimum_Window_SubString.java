// leetcode - 76 
// https://www.youtube.com/watch?v=WJaij9ffOIY
/*
 Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that 
 every character in t (including duplicates) is included in the window. If there is no such substring, 
 return the empty string "".

The test cases will be generated such that the answer is unique.

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 */
package Substrings;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_SubString 
{
	public static void main(String[] args) {
		String s= "ddaaabbca"; String t = "abc";
		System.out.println(minWindow(s,t));
	}
	static String minWindow(String s, String t) {

	    if (t.length() > s.length())
	        return "";

	    Map<Character, Integer> map = new HashMap<>();

	    // Store frequency of characters in t
	    for (char c : t.toCharArray())
	        map.put(c, map.getOrDefault(c, 0) + 1);

	    int count = 0;
	    int startIndex = -1;
	    int minLength = Integer.MAX_VALUE;

	    int l = 0, r = 0;
	    int n = s.length();
	    int m = t.length();

	    char[] charS = s.toCharArray();

	    while (r < n) {

	        if (map.containsKey(charS[r])) {

	            if (map.get(charS[r]) > 0)
	                count++;

	            map.put(charS[r], map.get(charS[r]) - 1);
	        }
	        // Shrink window
	        while (count == m) {

	            if (r - l + 1 < minLength) {
	                minLength = r - l + 1;
	                startIndex = l;
	            }

	            if (map.containsKey(charS[l])) {

	                map.put(charS[l], map.get(charS[l]) + 1);

	                if (map.get(charS[l]) > 0)
	                    count--;
	            }

	            l++;
	        }

	        r++;
	    }

	    return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
	            
	}
}
