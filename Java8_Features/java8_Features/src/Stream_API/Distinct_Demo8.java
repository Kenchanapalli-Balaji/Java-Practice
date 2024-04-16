package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 		Non_Terminal Methods :1.filter() 2.map() 3.flatmap() 4. distinct() 5. limit() 6.sorted()
 		Teminal Methods : 1.count() 2. min() 3. max() 4.collect() 5.forEach() 6.reduce() 7.toArray()
 */
public class Distinct_Demo8 
{
	public static void main(String[] args)
	{
		////////////////////// distinct()   ////////////////////////
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,1,2,3,6,7,8,8);
	//  list.stream().distinct().forEach(System.out::println);
		List<Integer> distinctList=list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		//////////////////// count() //////////////////////////
		
		long l=list.stream().distinct().count();
		System.out.println(l);
		
		 
		////////////////// limit() ///////////////////////////
		
		list.stream().limit(5).forEach(System.out::println);
		
		///////////////// min() /////////////////////////
		Optional<Integer> min=list.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println("minimum value in the list: " +min.get());
		
		////////////////  max()  ////////////////////////
		Optional<Integer> max=list.stream().max((val1, val2)->{return val1.compareTo(val2);});
		System.out.println("Maximum value in the list:  "+max.get());
		
		/////////////// reduce() ////////////////////////
		
	    Optional<Integer> res=list.stream().filter(n->n%2==0).reduce((val1,val2)->{ return val1+val2;});
	    System.out.println(res.get());
		
	}
}
