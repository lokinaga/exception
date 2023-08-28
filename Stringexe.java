package Exception;

public class Stringexe {
	public static void main(String[] args) {
		String word = "arun";
		
		try {
			System.out.println(word.charAt(10));
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println(se + "Exception handled");
			se.printStackTrace();
		}
		finally {
			System.out.println("rest of code");
		}
		System.out.println("rest");
	}

}
