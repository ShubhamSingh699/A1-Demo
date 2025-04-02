package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
	@ Test(priority = 1)
	public void CreateUser() {
	
		System.out.println("User Created");
		
	}
	@Test(priority = 2, invocationCount = 2)
	
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	
	@Ignore
	@Test(priority=3, dependsOnMethods={"CreateUser"})
	public void deleteUser() {
		System.out.println("User Deleted");
	}
	
	
	
	

}
