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
		int[] arr= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		
		int k=3;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int zeros=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==0)
					zeros++;
				if(zeros<=k)
					max=Math.max(max, j-i+1);
			}
		}
		System.out.println(max);
	}
	
	
}
