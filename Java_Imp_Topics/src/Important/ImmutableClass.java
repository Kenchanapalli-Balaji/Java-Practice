//https://youtu.be/SqDbZOjW1uM
package Important;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass 
{
	private final String name;
	private final List<Object> petNameList;
	
	 ImmutableClass(String name, List<Object> petNameList) 
	 {
		this.name=name;
		this.petNameList=petNameList;
	 }

	public String getName() {
		return name;
	}
	public List<Object> getPetNameList() 
	{
		// this is required , because making list final,
		// means you can not now point it to new list, but still can add, delete values in it,
		// so thats why we send the deep copy of it
		//return petNameList;
		return new ArrayList<Object>(petNameList);
	}
	
	public static void main(String[] args) 
	{
		List<Object> petNames=new ArrayList<Object>();
		petNames.add("Lufie"); petNames.add("sweety");
		ImmutableClass obj=new ImmutableClass("Balaji", petNames);
		System.out.println(obj.getName());
		obj.getPetNameList().add("Chinnu");
		System.out.println(obj.getPetNameList());
	} 
}
