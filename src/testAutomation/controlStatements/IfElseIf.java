package testAutomation.controlStatements;

public class IfElseIf {
	
	public void testAge(int age)
	{
		if(age>18)
		{
			System.out.println("Person is Major");
		}
		else if (age<5)
		{
			System.out.println("Person is Minor");
		}
		else
			System.out.println("Invalid data");
	}

	public static void main(String[] args) {
		IfElseIf obj = new IfElseIf();
		obj.testAge(20);
		
		obj.testAge(2);
		
		obj.testAge(6);
	}

}
