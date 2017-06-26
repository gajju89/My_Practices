package com.gajju.java;

import java.util.Map;
import java.util.TreeMap;

public class PermutationWithRecursion {
	 static int  resultCount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] array="bdacd".toCharArray();
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for(char c: array)
		{
			map.compute(c, (key,val)->{
				if(val==null)
					return 1;
				else
				{
				return val+1;
				}	
			});
		}
		//System.out.println(map);
		int[] count=new int[map.size()];
		char[] str=new char[map.size()];
		int index=0;
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			str[index]=entry.getKey();
			count[index]=entry.getValue();
			index++;
		}
		char[] result=new char[array.length];
		permuteUtil(count,str,result,0);
		System.out.println("Total Result:"+resultCount);

	}

	public static void permuteUtil(int[] count,char[] str,char[] result,int level)
	{
		
		if(level==result.length)
		{
			resultCount++;
			printArray(result);
			return;
		}
		for(int i=0;i<str.length;i++)
		{
			if(count[i]==0)
			{
				continue;
			}
			result[level]=str[i];
			count[i]--;
			permuteUtil(count,str,result,level+1);
			count[i]++;
			
		}
		
	}
	
	public static void printArray(char[] array)
	{
		
		for(char ch:array)
		{
			System.out.print(ch);
			
		}
		System.out.println();
	}

}
