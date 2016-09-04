import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest1 {
   
   @BeforeClass
   public static void beforeClass() {
      System.out.println("before class");
   }

   @AfterClass
   public static void afterClass() {
      System.out.println("after class");
   }

   @Before
   public void beforeTest() {
      System.out.println("before test");
   }
	
   @After
   public void afterTest() {
      System.out.println("after test");
   }
   
   @Test
   public void runTest() {
      System.out.println("test to run");
   }
	
   @Ignore
   public void ignoreTest() {
      System.out.println("test to ignore");
   }
   
   @Test
   public void testInteger() {
      int i = 2 + 3;
      assertEquals(5, i);
   }
}