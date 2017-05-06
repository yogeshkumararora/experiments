package experiments.home;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageUtilTest {

  String message = "Hello World";	
  MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}  
