package com.gajju.interviebitproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitPattern {
	public static void main(String args[])
	{
		int n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input value:");
		try {
			 n=Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x=n;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(j==1 || j==n*2-1)
				{
					System.out.print(n);
					
				}
				else if((j==2 || j==n*2-2 ))
				{
					System.out.print(n-1);
					
				}
				else if((j==3 || j==n*2-3) )
				{
					System.out.print(n-2);
					
				}
				else if((j==4 || j==n*2-4))
				{
					System.out.print(n-4);
					
				}
				else
				{
					System.out.print(x);	
				}
				
				
			}
			System.out.println();
			x=x-1;
			
		}
	}

}
