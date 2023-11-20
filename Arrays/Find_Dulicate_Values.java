package Arrays.copy;

public class Find_Dulicate_Values 
{
	public static void main(String[] args) 
	{
		int ar[] ={1, 2, 5, 5, 6, 6, 7, 2};
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j]&& i!=j)
					System.out.println("Duplicate elements: "+ar[i]);
			}
		}
	}
}
