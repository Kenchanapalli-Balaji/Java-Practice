package Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_Arrays 
{
	public static void main(String[] args) 
	{
		int[] arr1= {1,2,3,4,5,4,5};
		int[] arr2= {6,7,8,9,10};
		
		// Merging 2 unsorted Arrays into sorted array
		int[] res=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		System.out.println(Arrays.toString(res));
		
		// without Duplicates
		int[] res2=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				.sorted().distinct().toArray();
		System.out.println(Arrays.toString(res2));
	}
}
