/*
 -> A Java singleton class is a class that can have only one object at a time.
 
 Note:
 ================
 1. Make a constructor as private 
 2. Write a static method that has the return type object of this singleton class.
 
 Purpose of Singelton:
 ======================================
 1). The Primary purpose of Java Singleton class is to restrict the limit of the number of
 	objects to only one.
 2). This often ensures that there is access control to resources, like Socket or database Connection.
 
 Different ways of creating Singleton Class :
 =====================================================
 1). Eager Initialization
 2). Lazy Initialization 
 3). Synchronization Block
 4). Double check lock
 5). Bill pugh Solution 
 6). Enum Singleton
 */
package Important;


					//   1). Eager Method :

// class DBConnection
// {
//				private static DBConnection obj=new DBConnection();
// 				private DBConnection(){}
//				public static DBConnection getInstance()
//				{
//					return obj;
//				}
// }
	
	/*
	 DisAdvantages :
	 =================
	 1. May lead to resource wastage, because instance of class is created always, whether it ir required or not.
	 2. CPU time also wasted in creation of instance if it not required.
	 3. Exception Handling is not possible.
	 */ 

 
	
							// 2) Lazy Initialization :


// class DBConnection {
//				
//				  private static DBConnection obj;
//				  private DBConnection (){}
//				  public static DBConnection getInstance()
//				  {
//					  if(obj==null)
//					  {
//						  obj=new DBConnection();
//					  }
//					  return obj;
//				  }
//  }
	
	  /*
	    DisAdvantages :
	    ====================
	    1). In multithreaded environment it may break singleton property.
	    2). That is if any 2 threads access at a time it will create 2 objects.
	   */
	
				// 3). Synchronized Method  :


//   class DBConnection 
//  {
//	    private static DBConnection obj;
//	    private DBConnection() {}
//	    synchronized public static DBConnection getInstance()
//	    {
//		    if(obj==null)
//		    {
//			   obj=new DBConnection();
//		    }
//		    return obj;
//	     }	
//   }
		
	/*
	  DisAdvantages : 
	  ====================
	  1). getInstance() method is a synchronized so it cause slow performance as multiple threads 
	   		can not access it simultaneously.
	  2). if multiple times calls the method, every time synchronized will do lock and unlock.
	 */

						// 4). Double Locking :

/*
->  In this method , getInstance is not synchronized but the block which creates instance is synchronized.
->  So that minimum number of threads have to wait and thats only for first time.
 */

//	 class DBConnection 
//	{
//		private static DBConnection obj;
//		private DBConnection() {}
//		public static DBConnection getInstance()
//		{
//			if(obj==null)
//			{
//				synchronized(DBConnection.class)
//				{
//					if(obj==null)
//					{
//						obj=new DBConnection();
//					}
//				}
//			}
//			return obj;
//		}
//	}


					// 5). Bill pugh Singleton Implementation :

/*
 -> Prior to Java5, memory model had a lot of issues and above methods caused failure in certain scenarios
    in multi threaded environment.
  -> So Billpugh suggested a concept of inner static classes to use for Singleton.
 */

		class DBConnection 
		{
			private DBConnection() {}
			private static class DBConnectionHelper
			{
				private static final DBConnection INSTANCE_OBJECT = new DBConnection();
			}
			public static DBConnection getInstance()
			{
				return DBConnectionHelper.INSTANCE_OBJECT;
			}
		}
		
	/*
	 	Note :
	 	===========
	 	-> When an singleton class is loaded, inner class is not loaded and hence does not create 
	 	 	the Object when loading the class.
	 	-> Inner class is created only when getInstance() method is called. So it may seem like eager initialization
	 	   but it is lazy initialization.
	 	-> This is the most widely used approach it does not Synchronization.
	 */

		//   6). ENUM :
//			enum DBConnection
//			{
//				INSTANCE;
//			}
		
		/*
		 Note : 
		 ============
		 1. In ENUM by default all constructores are final.
		 2. By default Enums are Singleton only.
		 */

	

public class Singleton_Design_Pattern 
{
	
	public static void main(String[] args) 
	{
		DBConnection o=DBConnection.getInstance();
	}
}
