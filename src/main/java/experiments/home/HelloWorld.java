package experiments.home;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World GitHub - Master Updated Again!");
		
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
