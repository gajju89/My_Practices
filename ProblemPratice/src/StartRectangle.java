
public class StartRectangle {
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			
			for(int j=1;j<=12;j++)
			{
				if(i<=5&&i>=2)
				{
					for(int k=1;k<=12;k++)
					{
						if(k==1 ||k==12)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						
					}
					break;
				}
				else
				{
					System.out.print("*");	
				}
				
			}
			/*System.out.print("*");*/
			System.out.println();
		}
		
	}

}
