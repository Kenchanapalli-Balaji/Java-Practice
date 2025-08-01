// leetcode - 14 
/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
package Strings;

import java.util.Arrays;

public class Longest_Common_Prefix 
{
	public static void main(String[] args)
	{
		String ar[]= {"flower","flight","flow"};
		String prefix=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			while(ar[i].indexOf(prefix)!=0)
				prefix=prefix.substring(0,prefix.length()-1);
		}
		System.out.println(prefix);
		
		/////////////// Approach 2 //////////////
		/*
		Arrays.sort(ar);
		String s1=ar[0];
		String s2=ar[ar.length-1];
		int i=0;
		while(i<s1.length())
		{
			if(s1.charAt(i)==s2.charAt(i))
				i++;
			else
				break;		
		}
		System.out.println(s1.substring(0,i));
		*/
		
	}
}


/*
Working:
1)Take the first(index=0) string in the array as prefix.
2)Iterate from second(index=1) string till the end.
3)Use the indexOf() function to check if the prefix is there in the strs[i] or not.
If the prefix is there the function returns 0 else -1.
4)Use the substring function to chop the last letter from prefix each time the function return -1.

eg:
strs=["flower", "flow", "flight"]
prefix=flower
index=1
   while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flower")!=0)
   Since flower as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flowe"
   Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flowe")!=0)
   Since flowe as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flow"
   Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flow")!=0)
   Since flow as a whole is in flow, it returns 0 so now prefix=flow
index=2
   while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flow")!=0)
   Since flow as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flo"
   Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flo")!=0)
   Since flo as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "fl"
   Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("fl")!=0)
   Since fl as a whole is in flight, it returns 0 so now prefix=fl
index=3, for loop terminates and we return prefix which is equal to fl
*/
