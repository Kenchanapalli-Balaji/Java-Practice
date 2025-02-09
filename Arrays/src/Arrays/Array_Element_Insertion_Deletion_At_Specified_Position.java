package Arrays;
class Array_Element_Insertion_Deletion_At_Specified_Position
{
	public static void main(String[] args) 
	{	
		/*
		//INSERTION AT SPECIFIED POSITION
		int arr[]= {1,2,3,5,6,7,8,9,10};
		int na[]=new int[arr.length+1];
		int ele=4;
		int index=3;
		
		na[index]=ele;
		for(int i=0;i<arr.length;i++)
		{
			if(i<index)
				na[i]=arr[i];
			else
				na[i+1]=arr[i];
		}
		
		for(int i=0;i<na.length;i++)
		{
			System.out.println(na[i]);
		}
		*/
		

		//DELETION AN ELEMENT IN ARRAY AT SECIFIED POSITION	
		
		int arr[]= {1,2,3,5,11,6,7,8,9,10};
		int na[]=new int[arr.length-1];
		int index=4;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(i<index)
				na[i]=arr[i];
			else
				na[i]=arr[i+1];
		}
		for(int i=0;i<na.length;i++)
		{
			System.out.println(na[i]);
		}
		
	}
}