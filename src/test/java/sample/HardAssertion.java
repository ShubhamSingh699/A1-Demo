package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void strictLevelComparison()
	{
		String excpectedName = "Raja";
		String actualName =  "Raja";
		Assert.assertEquals(actualName, excpectedName);
		Assert.assertTrue(actualName.equals(excpectedName));
		Assert.assertEquals(actualName.equals(excpectedName), true);
		System.out.println("Hard Assertion Strict Level Completed");
	}
	public void containsLevelComparison()
	{
		String a1 = "Don";
		String a2 = "London";
		Assert.assertTrue(a2.contains(a1));
		System.out.println("Hard Assertion contains level completed");
	}
}
