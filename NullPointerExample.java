package Exception;

public class NullPointerExample {
public static void main(String[] args) {
	String  word = null;
	
	try {
		
	
	System.out.println(word.toUpperCase());
	}
	catch (NullPointerException nl) {
		System.out.println(nl +"value is null");
		nl.printStackTrace();
	}
	finally {
		System.out.println("Exception handle");
	}
	
	System.out.println("rest of the code");
}
}
