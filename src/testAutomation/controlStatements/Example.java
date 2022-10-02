package testAutomation.controlStatements;

public class Example extends Object {

	int age;
	static final int MAX_AGE=18;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}

	public static void main(String[] args) {
		
	Example obj1 = new Example();
	obj1.getAge();
	obj1.setAge(4);

	Example obj2 = new Example();
	obj2.getAge();
	obj2.setAge(8);
	

	}

}
