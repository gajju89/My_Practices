
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class CSV {
    public static void main(String[]args) throws IOException{
    	String path = "hi.csv";
 // Use relative path for Unix systems
    File f = new File(path);
 
    /*if(!f.exists())
    {
    	System.out.println("myFile is: " + f.getAbsolutePath());
    	
    }*/
    	//File file=new File("/Documents/test.csv");
        PrintWriter pw = new PrintWriter(f);
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(',');
        sb.append("Name");
        sb.append('\n');

        sb.append("1");
        sb.append(',');
        sb.append("Prashant Ghimire");
        sb.append('\n');
        sb.append("2");
        sb.append(',');
        sb.append("Gajendra Singh");
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
}