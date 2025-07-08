package Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Demo
{
	public static void main(String[] args) 
	{
		int[] arrival = {900, 940, 950, 1100, 1110, 1800};
		int[] departure= {910, 1200, 1120, 1130, 1140, 2000};
		
		Arrays.sort(arrival); Arrays.sort(departure);
		int i=0;int j=0; int count=0; int maxCount=0;
		while(i<arrival.length)
		{
			if(arrival[i]<departure[j])
			{
				count++;
				i++;
			}
			else
			{
				count--;
				j++;
			}
			maxCount=Math.max(maxCount, count);
		}
		System.out.println(maxCount);
		
	}
	
}