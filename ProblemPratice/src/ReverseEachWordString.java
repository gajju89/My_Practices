
public class ReverseEachWordString {
	
	public static void main(String args[])
	{
		String str="Gajju is brillient";
		String[] afterSplit=str.split(" ");
		String reverse="";
		for(String s:afterSplit)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				reverse=reverse+s.charAt(i);
			}
			reverse+=" ";
		}
		System.out.println(reverse);

	}

}
