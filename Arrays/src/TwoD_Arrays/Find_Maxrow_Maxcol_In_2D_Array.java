//leetcode - 1380
package TwoD_Arrays;

public class Find_Maxrow_Maxcol_In_2D_Array 
{
	public static void main(String[] args) 
	{
		int arr[][]= {{3,7,8},{9,11,13},{15,16,17}};
		// To find maximum value in each row and in each column


		/*
		for(int i=0;i<arr.length;i++)
		{
			int maxcol=arr[0][i];
			int maxrow=arr[0][i];
			for(int j=1;j<arr[i].length;j++)
			{
				if(arr[j][i]>maxcol)
					maxcol=arr[j][i];
				if(arr[i][j]>maxrow)
					maxrow=arr[i][j];
			}
			//System.out.print(maxcol+" ");
			System.out.print(maxrow+" ");
			System.out.println();
		}
		*/
		
		// To find minimum value in each row&in each column
		
		for(int i=0;i<arr.length;i++)
		{
			int mincol=arr[0][i];
			int minrow=Integer.MAX_VALUE;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[j][i]<mincol)
					mincol=arr[j][i];
				if(minrow>arr[i][j])
					minrow=arr[i][j];
			}
			System.out.print(mincol+" ");
			System.out.print(minrow+" ");
			System.out.println();
		}

		/*
		    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int[] minMatrixEachRow = new int[matrix.length];
        int[] maxMatrixEachColumn = new int[matrix[0].length];
        
        
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        
         //Finding min element of  each row and storing in an array
        for(int i=0; i< matrix.length;i++)
        {
               minElement = Integer.MAX_VALUE ;
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j]< minElement)
                {
                    minElement = matrix[i][j];
                }
            }
            minMatrixEachRow[i] = minElement ;
        }
        
         //Finding max element of each column and storing in an array
        for(int i=0; i< matrix[0].length;i++)
        {
            maxElement = Integer.MIN_VALUE ;  
            
            for(int j=0; j< matrix.length; j++){
                if(matrix[j][i]> maxElement)
                {
                    maxElement = matrix[j][i];
                }
            }
            maxMatrixEachColumn[i] = maxElement ;
        }
        
        
        
     //Initializing an ArrayList
        List<Integer> ans = new ArrayList<>();
        
        //Iterating through
        for(int i=0; i< minMatrixEachRow.length ; i++){
            for(int j=0; j< maxMatrixEachColumn.length ;j++)
            {
             if(minMatrixEachRow[i] == maxMatrixEachColumn[j]){
                 ans.add(minMatrixEachRow[i]);
             }   
            } 
        }
        
        return ans;
                
     
    }	
		 */
	}
}
