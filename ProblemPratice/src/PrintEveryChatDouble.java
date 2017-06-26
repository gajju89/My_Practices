import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintEveryChatDouble {
	
	
	public static void main(String args[])
	{
		String word=null;
		String afterDouble="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			 word=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			for(int j=0;j<=1;j++)
			{
				afterDouble=afterDouble+ch;
			}
			
			
		}
		System.out.println(afterDouble);
	}

}
