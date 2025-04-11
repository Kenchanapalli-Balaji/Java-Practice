package Abstarct_Factory_Pattern;

// This is the factory of factory, gives you factory instance which will in turn give u required class object

public class Abstract_Factory_Producer 
{
	public static Abstract_Factory getProfession(boolean isTrainee)
	{
		if(isTrainee)
			return new Trainee_Profession_Abstract_Factory();
		else
			return new Profession_Abstract_Factory();
	}
}
