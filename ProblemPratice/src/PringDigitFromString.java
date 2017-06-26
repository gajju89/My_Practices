
public class PringDigitFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mixed="Gajendra123Singh89";
		for(int i=0;i<mixed.length();i++)
		{
		if((mixed.charAt(i)>=65&&mixed.charAt(i)<=90)||(mixed.charAt(i)>=97&&mixed.charAt(i)<=122))
		{
			continue;
		}
		System.out.print(mixed.charAt(i));
		}

	}

}
