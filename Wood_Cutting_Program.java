//https://youtu.be/Acp-mC0JWFk?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
public class Wood_Cutting_Program 
{
	static int findMax(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	static int machineHeight(int arr[],int b,int max)
	{
		int l=0;
		int h=max;
		while(l<=h)
		{
			int mid=(l+h)/2;
			int wc=findWoodCount(arr,mid);
			if(wc==b || l==mid)
			{
				return mid;
			}
			else if(wc>b)
			{
				l=mid;
			}
			else
				h=mid;
		}
		return -1;
	}
	static int findWoodCount(int arr[],int mid)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>mid)
				res+=arr[i]-mid;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		int arr[]= {20,15,10,17};
		int b=8;
		int max=findMax(arr);
		int res=machineHeight(arr,b,max);
		System.out.println(res);
		
	}
}
