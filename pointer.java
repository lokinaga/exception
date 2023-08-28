package Exception;

public class pointer {
	public static void main(String[] args) {
		String word = null;
		int  num =10;
		try {
			int len = word.length();
			int answer = num/len;
			
		}
		catch(NullPointerException n ) {
			System.out.println(n + "word is null");
			
		}
		catch (ArithmeticException  ae) {
			System.out.println( ae+ "cannot divide by zero");
			
		}
		catch( Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
