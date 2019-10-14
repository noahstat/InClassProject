
public abstract class NameHolder 
{
	protected String firstName;
	
	public abstract String describeSelf();

	@Override
	public String toString()
	{
		return "Firse name: " + firstName;
	}
	
	protected void setFirstName(String firstName) throws NameException
	{
		if(!firstName.isEmpty())
		{
			this.firstName = firstName;
		}
		else 
		{
			throw new NameException("WRONG");
		}
	}
	
	protected String getFirstName()
	{
		return new String(firstName);
	}
	
}
