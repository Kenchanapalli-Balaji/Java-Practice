package IEVOVLE.copy;
class NonPrimitiveArray
{
	String studentName;
	int studentId;
	int studentScore;
	
	 NonPrimitiveArray(String studentName, int studentId, int studentScore)
	{
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentScore=studentScore;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	
	
	
	@Override
	public String toString() {
		return " NonPrimitiveArray [studentName=" + studentName + ", studentId=" + studentId + ", studentScore=" + studentScore + "]";
	}

	public static void main(String[] args) 
	{
		NonPrimitiveArray o1=new NonPrimitiveArray("Meena",1,90);
		NonPrimitiveArray o2=new NonPrimitiveArray("Balu",2,30);
		NonPrimitiveArray o3=new NonPrimitiveArray("Sravani",3,60);
		NonPrimitiveArray o4=new NonPrimitiveArray("Sushanth",4,20);
		NonPrimitiveArray o5=new NonPrimitiveArray("Vishnu",5,70);
	
		NonPrimitiveArray arr[]=new NonPrimitiveArray[] {o1,o2,o3,o4,o5};
		sort(arr);
		
		
	}
	

	public static void sort( NonPrimitiveArray arr[])
	{
		NonPrimitiveArray temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].getStudentScore()>arr[i].getStudentScore())
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
	}
}