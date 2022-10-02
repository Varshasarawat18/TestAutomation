package testAutomation.controlStatements;

public class ForEachLoopExample {
	
	public static void main (String arg[])
	{
		int array[]= {103,203,403,503};
		
		System.out.println(array.length);
		for(int i =0 ; i<array.length;i++)
		{
			System.out.println(array[i]);    //video 12 java
		}
		for(int i :array)
		{
		//System.out.println("Array is:" +array[i]); //here exception thrown not aware why?  the run in debug mode
		//here it is saying array 103 position so there is not data present as that so change it to i
		System.out.println("Array is:" +i );
		}
	}

}
