package Exception;

public class StackOverFlowExample {

	public void callA() {
		callB();
		
	}
	public void callB() {
		callA();
	}
	public static void main(String [] args) {
		StackOverFlowExample s  = new StackOverFlowExample();
		
		s.callA();
	}
	
	
}
