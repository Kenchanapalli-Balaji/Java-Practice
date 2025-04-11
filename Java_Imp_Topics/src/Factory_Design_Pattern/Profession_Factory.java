package Factory_Design_Pattern;

public class Profession_Factory 
{
	public Profession getProfession(String typeOfProfession)
	{
		if(typeOfProfession==null)
			return null;
		if(typeOfProfession.equalsIgnoreCase("Doctor"))
			return new Doctor();
		else if(typeOfProfession.equalsIgnoreCase("Teacher"))
			return new Teacher();
		else if(typeOfProfession.equalsIgnoreCase("Engineer"))
			return new Engineer();
		return null;
	}
}
