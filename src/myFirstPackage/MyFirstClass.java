package myFirstPackage;

public class MyFirstClass 
{

	public static void main(String[] args) 
	{
		// main method inherits from Thread. 
		//entry point  for  the  project
		String message = "hello";
		System.out.print(message);
		int i = 5;
	

		int year = 2024;
		boolean isLeapYear = (year%4 ==0) && (year%100 !=0);
		System.out.println("Year" + isLeapYear);
		
		

	}

}
