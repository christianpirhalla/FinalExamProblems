package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Rectangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	
	public void IllegalRectangle_Test() throws IllegalRectangle{
		
		try
		 {
			Rectangle r3 = new Rectangle(-5, -10);
		     if(r3.ComputeArea() < 0)
		     {
		          throw new IllegalRectangle();
		     }
		 }
		 catch(IllegalRectangle IR)
		 {
		      System.out.println("negative dimmensions are not allowed");
		 }
	}
	

}
