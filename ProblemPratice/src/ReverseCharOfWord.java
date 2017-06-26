import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCharOfWord {
	public static void main(String args[])
	{
		
	String line=null;
	String afterReverse="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your string:");
	try {
		 line=br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String[] stringArray=line.split(" ");
	for(int i=(stringArray.length)-1;i>=0;i--)
	{
		String wordToReverse=stringArray[i];
		String reverseWord="";
		for(int j=wordToReverse.length()-1;j>=0;j--)
		{
			reverseWord=reverseWord+wordToReverse.charAt(j);
			
		}
	
	afterReverse=afterReverse+" "+reverseWord;
	}
	
	System.out.println(afterReverse);
}

}
