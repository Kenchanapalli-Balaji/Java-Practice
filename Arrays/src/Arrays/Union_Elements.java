//https://youtu.be/wvcQg43_V8U
//https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
/*
 Examples:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
 */
package Arrays;

import java.util.*;
public class Union_Elements 
{
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5}; 
		int arr2[]= {1,2,7};
		
		List<Integer> union = new ArrayList<Integer>();
		int n1=arr1.length;
		int n2=arr2.length;
		int i=0;
		int j=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i])  // checking whether is it first element or 								
					union.add(arr1[i]);  //is it same as before element
				i++;
			}
			else
			{
				if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
					union.add(arr2[j]);
				j++;
			}
		}
		while(i<n1)
		{
			if(union.size()==0 || union.get(union.size()-1)!=arr1[i])
				union.add(arr1[i]);
			i++;
		}
		while(j<n2)
		{
			if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
				union.add(arr2[j]);
			j++;
		}
		System.out.println(union);
		// +++++++++++++++++++++ Using Set Method +++++++++++++++++++++++++++
		
		/*
			Set<Integer> set=new HashSet<Integer>();
			List<Integer> list=new ArrayList<Integer>();
			for(int i:arr1)
				set.add(i);
			for(int i:arr2)
				set.add(i);
			for(int i:set)
				list.add(i);
			
			int[] res=list.stream().mapToInt(Integer::intValue).sorted().toArray();
			System.out.println(Arrays.toString(res));
			
		  */  
		
		// +++++++++++++++++++ using HashMap +++++++++++++++++++++
		/*
		List<Integer> unionElements=new ArrayList<Integer>();
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i:arr1)
		{
			hm.put(i, hm.getOrDefault(hm.get(i), 0)+1);
		}
		for(int i:arr2)
		{
			hm.put(i, hm.getOrDefault(hm.get(i), 0)+1);
		}
		for(int i:hm.keySet())
			unionElements.add(i);
		System.out.println(unionElements);
		*/
	}
}
