package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@SmokeTest")
	public void beforeValidation()
	{
		System.out.println("Before SmokeTest");
	}
   @After("@SmokeTest")
   public void afterValidation()
   {
	  System.out.println("After SmokeTest"); 
   }
   
   @Before("@SanityTest")
	public void beforeValidations()
	{
		System.out.println("Before Sanity");
	}
  @After("@SanityTest")
  public void afterValidations()
  {
	  System.out.println("After Sanity"); 
  }
}
