package Exception;

public class Numberfount {
	public static void main(String[] args) {
		
		
		String  word = "";
		try {
			
		
		int num = Integer.parseInt(word);
		System.out.println(num +"value");
	}
		catch(NumberFormatException nf) {
			System.out.println(nf +"Exception handle");
			//nf.printStackTrace();
		}
		finally {
			System.out.println("rest of the code");
		}
System.out.println("rest");
}
}
