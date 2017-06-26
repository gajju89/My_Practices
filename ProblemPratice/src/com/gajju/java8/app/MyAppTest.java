package com.gajju.java8.app;

import java.util.Map;
import java.util.TreeMap;

public class MyAppTest {

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
		System.out.println(map);

	}
	


}
