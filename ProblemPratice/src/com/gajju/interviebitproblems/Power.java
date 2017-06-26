package com.gajju.interviebitproblems;

public class Power {
	int pow (int a, int b)
	{
	    if ( b == 0)        return 1;
	    if ( b == 1)        return a;
	    if (isEven( b ))    return     pow ( a * a, b/2); //even a=(a^2)^b/2
	    else                return a * pow ( a * a, b/2); //odd  a=a*(a^2)^b/2

	}
	public boolean isEven(int a)
	{
		if(a%2==0)
		{
			return true;
		}else
			return false;
	}
public boolean isPower(int a) {
        
        
        for(int i=2;i<a;i++)
        {int num=0;
            for(int j=2;j<a/2;j++)
            {
                num=pow(i,j);
                if(num==a)
                {
                    return true;
                  
                }
                
            }
            
        }
        return false;
        
        
    }
	public static void main(String args[])
	{
		try{
		System.out.println(new Power().isPower(1024000000));
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	

}
