import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingExactThreeTime {
	
	public static void main(String args[])
	{
		int count=0;
		String line=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your string:");
		try {
			 line=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] array=line.toCharArray();
		
		 char digit = 0;
for(int i=0;i<array.length;i++)
{
	for(int j=i+1;j<array.length;j++)
	{
		if(array[i]==array[j] && array[i]!=array[i+1])
		{
			count=count+1;
			digit=array[i];
			
		}
	}
	
}
if(count==3)
{
	System.out.println(digit+"  exactly repeats 3 times");
}
else
{
	System.out.println("no digit exactly repeats 3 times");
}
	}

}
