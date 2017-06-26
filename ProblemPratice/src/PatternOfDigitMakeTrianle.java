
public class PatternOfDigitMakeTrianle {

	static int k=1;
	static int l=9;
	static int m=10;
	static int n=14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(k);
					k=k+1;
					
				}
				else if(i==j+1)
				{
					System.out.print(l+" ");
					l=l-1;
					
				}
				else if(i==j+2)
				{
					System.out.print(m+" ");
					m=m+1;
					
				}
				else if(i==j+3)
				{
					System.out.print(n+" ");
					n=n-1;
					
				}
				else if(i==j+4)
				{
				System.out.print("15 ");
				continue;
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
