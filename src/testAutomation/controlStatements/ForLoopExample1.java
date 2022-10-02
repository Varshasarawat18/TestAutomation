package testAutomation.controlStatements;

public class ForLoopExample1 {

	public static void main (String[] args)
	{
		int array[]= {120,230,404,560,708};
		
		int a[] = new int[4];  //another way to declare array in java
		a[0]=10;
		a[1]=20;
		a[3]=30;
		a[4]=40;		
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Array is "+array[i]);
		}
			
	}
}
