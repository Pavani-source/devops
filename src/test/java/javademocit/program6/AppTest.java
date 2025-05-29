package javademocit.program6;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private App app;
	public AppTest( String testName )
    {
        super( testName );
        this.app=new App();   
    }
	public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
	public void testApp()
    {
        assertTrue( true );
    }
	public void testfact() {
		assertEquals("Factorial of 0 must be 1",1, App.calculateFactorial(0));
	}
	public void testfact1()
	{
		assertEquals("Factorial of 5 must be 120",120, App.calculateFactorial(5));
    }
}
