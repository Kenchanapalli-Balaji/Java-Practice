package Arrays;

import java.util.HashMap;

public class Find_Dulicate_Values 
{
	public static void main(String[] args) 
	{
		int ar[] ={1, 2, 5, 5, 6, 6, 7, 2};
		//////////////////////Using HashMap ////////////////////
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i:ar)
			hm.put(i,hm.getOrDefault(i,0)+1);
		for(int i:hm.keySet())
		{
			if(hm.get(i)>1)
				System.out.println("Duplicate Elements are : "+ i);
		}
		//////////////////// Using Forloops //////////////////////
		/*
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j]&& i!=j)
					System.out.println("Duplicate elements: "+ar[i]);
			}
		}
		*/
	}
}
