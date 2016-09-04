import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest1 {
   
   @Test
   public void testInteger() {
      int i = 2 + 3;
      assertEquals(5, i);
   }
}