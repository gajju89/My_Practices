
public class OddNumberUsingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{2,3,4,5,2,3,4,5,2,3,4,5,4};
		int result=0;
		for(int i=0;i<array.length;i++)
		{
			result=result^array[i];
		}
		System.out.println("Odd Number:"+result);

	}

}
