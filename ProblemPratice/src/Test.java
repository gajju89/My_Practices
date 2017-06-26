import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner file;
		String test = "";
		Double totalcount =0.0d;
		int count=0;

		   try {
	            file = new Scanner(new File("/home/gajendra/input"));
	            if (!file.hasNextLine()) {
	                System.out.println(" file is empty");
	            }
	            /*while (file.hasNext()) {
	                test = test + (" ") + file.next();
	            }
*/
	            while (file.hasNext()) {
	            	Double d=file.nextDouble();
	            	test = test + (" ")+d;
	                totalcount = totalcount + d;
	                count++;
	            }
	            while (file.hasNext()) {
	                test = test + (" ") + file.next();
	            }
	            

	        } catch (FileNotFoundException e) {
	            System.out.println( "file doesn't exist");
	        }
		   System.out.println("count"+totalcount);
		   System.out.println(test);

	}
	
	

}
