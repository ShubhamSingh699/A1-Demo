package sample;

import org.testng.annotations.Test;

public class TestNGPractice1 {

	@Test(priority = 1, invocationCount= 3)
	public void CreatedUser() 
	{
		 
		System.out.println("Created user");
	}
		
	@Test (priority = 2 , dependsOnMethods = {"CreatedUser"})
				
	public void modifyUser() 
	{
		System.out.println("user modified");
	}
		
		@Test (priority = 'A')
		public void deleteUser()
		
		{
				
System.out.println ("user deleted");


}		
	}
	


