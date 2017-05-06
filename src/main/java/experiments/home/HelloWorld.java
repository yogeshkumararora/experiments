package experiments.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	
        private final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		logger.debug("Hello World GitHub - Master Updated Again!");
		
		String str = "Hello World";
	      	String anotherString = "hello world";
	      	Object objStr = str;

   	       System.out.println( str.compareTo(anotherString) );
	       System.out.println( str.compareToIgnoreCase(anotherString) );
	       System.out.println( str.compareTo(objStr.toString()));
	}
	
	public void duplicateCodeExample() {
		System.out.println("Hello World GitHub - Master Updated Again!");
		
		String str = "Hello World";
	      	String anotherString = "hello world";
	      	Object objStr = str;

   	       System.out.println( str.compareTo(anotherString) );
	       System.out.println( str.compareToIgnoreCase(anotherString) );
	       System.out.println( str.compareTo(objStr.toString()));
	}

}
