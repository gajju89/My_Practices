
public class StrningCommonDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one="RAJASTHAN";
		String two="SUJANGARH";
		char[] oneArray=one.toCharArray();
		char[] twoArray=two.toCharArray();
		
		String afterOne="",afterTwo="";
		
		
		for(int i=0;i<one.length();i++)
		{
			int count=0;
		
			for(int j=0;j<two.length();j++)
			{
				
				
			if(one.charAt(i)==two.charAt(j))
			{
				count=count+1;
				afterTwo=afterTwo+two.charAt(j);
			}
			
			
		 }
			if(count==0)
			{
				afterOne=afterOne+one.charAt(i);
			}
			
		}
		
		
for(int k=0;k<two.length();k++)
		{
			int count=0;
		
			for(int l=0;l<afterTwo.length();l++)
			{
				
				
			if(two.charAt(k)==afterTwo.charAt(l))
			{
				count=count+1;
				
			}
			
			
		}
			if(count==0)
			{
				afterOne=afterOne+two.charAt(k);
			}
			
		}

	System.out.println("result:"+afterOne);
	}
}
