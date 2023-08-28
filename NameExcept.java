package Exception;

public class NameExcept {
	public static void main(String[] args) throws NameNotFoundException {

		String name = "";

		try {

			if (name == null|| name == "") {

				throw new NameNotFoundException("invalid credentials");

			} else {
				System.out.println("my name is" + name);
			}
			
		    } 
		catch (NameNotFoundException n) {
			    System.out.println(n.getMessage());
			    n.printStackTrace();
		} 
		
		finally {
			System.out.println("rest of the code");
		}

	}

}
