package Arrays.copy;
import java.util.HashMap;

class Count_Occurence_Of_Elements_In_Array
{
	public static void main(String[] args) 
	{
		int arr[]= {1,3,4,5,5,3,4,8,1};
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
				hm.put(i,1);
		}
		
		for(int i:hm.keySet())
		{
			System.out.println(i+ "  no of time occurs :" +hm.get(i));
		}
		
	}
}