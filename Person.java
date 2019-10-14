
public class Person extends NameHolder 
{

	private String lastName;
	
	public Person() throws NameException
	{
		String first = "Bo";
		String last = "Alex";
		this.lastName = last;
		super.setFirstName(first);
	}
	
	public Person(String firstName, String lastName) throws NameException
	{
		super.setFirstName(firstName);
		this.lastName = lastName;
	}
	
	@Override
	public String describeSelf()
	{
		String description = "***First Name: " + super.getFirstName() +
				" Last Name: " + lastName + "***";
		return description; //not in life tho!!!

	}

}
