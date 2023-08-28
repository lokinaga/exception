package Exception;

public class LoginValidation {
	public static void main(String[] args) throws LoginException {
		
		String username = "loki";
		String password = "loki@2";
		
		
		
		try {
		if(username.equals("loki")&& password.equals("loki@24") ) {
			System.out.println("Login Successful");
		}
		
		else {
			
			throw new LoginException("invalid credentials");
			}
		}
			catch (LoginException ae) {
				System.out.println(ae.getMessage());
				ae.printStackTrace();
				
			}
		finally {
			System.out.println("rest of the code");
		}
		System.out.println("rest");
		}
		
		
		
		
		
		
		
		
	}
	
	


