package Arrays.copy;
import java.util.*;

class Demo
{
	public static void main(String[] args) 
	{
		int n1=101;int n2=200;
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			int num=i;
			boolean visited[]=new boolean[10];
			while(num>0)
			{
				if(visited[num%10]==true)
					break;
				visited[num%10]=true;
				num=num/10;
			}
			if(num==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println(count);
	}
	
}

