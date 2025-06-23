package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) 
	{

		String s="abc";
		String t="ahbgdc";
		boolean isSubSequence=true;
		int i=0; int j=0;
		while(i<s.length() || j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
				j++;
		}
		if(i!=s.length())
			isSubSequence=false;
		System.out.println(isSubSequence );
		
	}
}
