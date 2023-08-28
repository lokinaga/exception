package Exception;

public class Array {
	public static void main(String[] args) {
		
		int []arr = {11,22,33};
		
		
		try {
			int a = arr[0];
			int  b = arr[1];
			int c = arr[2];
			int d =arr[3];
			//System.out.println(arr);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae + "exception handle");
			ae.printStackTrace();
			
		}
		finally {
			System.out.println("rest of the code");
		}
		System.out.println("rest");
	}

}

