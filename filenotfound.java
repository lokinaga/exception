package Exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class filenotfound {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		
		try {
		
		File  f = new File("D://loki/java.txt");
		FileReader fr = new FileReader(f);
		int temp =0;
		while(( temp = fr.read()) != -1) {
			System.out.println((char)(temp));
		}
		}	
	
		catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}
System.out.println("rest of code");
//System.out.println('a'+'b');
}
}
