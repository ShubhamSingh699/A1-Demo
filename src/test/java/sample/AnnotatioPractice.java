package sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotatioPractice {
	
@BeforeSuite
public void bsConfig()
{
	System.out.println("In before Suite");
}

@BeforeClass
public void bcConfig()
{
	System.out.println("In before Class");
}

@BeforeMethod
public void bmConfig()
{
	System.out.println("In before Method");
}

@Test

public void test()
{
	System.out.println("In Test Method");
}

@AfterMethod
public void amConfig()
{
	System.out.println("In After Method");
}

@AfterClass
public void acConfig()
{
	System.out.println("In After Class");
}

@AfterSuite
public void asConfig()
{
	System.out.println("In After Suite");
}

}
