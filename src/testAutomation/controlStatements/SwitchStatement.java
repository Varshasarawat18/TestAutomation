package testAutomation.controlStatements;

public class SwitchStatement
{
	public void checkBookAndPrice(String book)
	{
		String s1;
		switch(book)
		{
		case "MATH":
			s1="Author Aryabhatta Price=200";
			System.out.println(s1);
			break;
			
		case "PHYSICS":
			s1="Author Bhanu Pratap Price=250";
			System.out.println(s1);
			break;
			
		case "CHEMISTRY":
			s1="Author Pratap price=500";
			System.out.println(s1);
			break;
		
		case "BIOLOGY":
			s1="Atuthor SG pratap price=500";
			System.out.println(s1);
			break;
			default:
			System.out.println("No book found supply proper input");
			
		}
	}

	public static void main(String[] args) 
	{
		SwitchStatement obj1= new SwitchStatement();
		obj1.checkBookAndPrice("MATH");
		obj1.checkBookAndPrice("CHEMISTRY");

	}

}
