package experiments.home;

public class MessageUtilTest {

  String message = "Hello World";	
  MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}  
