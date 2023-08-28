package Exception;

public class ArithmaticException {
	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		// int c= a/b;
		// System.out.println(c);
		// System.out.println("divided has been completed");
		try {
			int c = a / b;
			System.out.println(c);
			
		}
		 catch (ArithmeticException ae) {
			System.out.println(ae + " values in zero");
			ae.printStackTrace(); // to identify the error in which line
		} 
		finally {
			System.out.println("Exception handling");
		}
		System.out.println("rest of the code");

	}

}
