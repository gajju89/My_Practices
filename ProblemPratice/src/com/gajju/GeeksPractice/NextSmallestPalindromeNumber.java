package com.gajju.GeeksPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextSmallestPalindromeNumber {
	
	
	public static void main (String args[]) throws IOException
	{
		System.out.println("Enter the number :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] array=br.readLine().split(" ");
		int[] num=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			num[i]=Integer.parseInt(array[i]);
			
		}
		
		System.out.print("Next Palindrom is: ");
		
	}
	
	public int nextPalindrom(int[] arr)
	{
		return 0;
	}

}
