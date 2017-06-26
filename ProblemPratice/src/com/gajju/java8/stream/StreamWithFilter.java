package com.gajju.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamWithFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,20,21,35,40,80,87,93);
		//Add those element with divisible by 2
		System.out.println("sum of element not divisible by two:"+list.stream().filter(i->i%2!=0).reduce(0,(c,e)->c+e));
		System.out.println("sum of element  divisible by two:"+list.stream().filter(i->i%2==0).reduce(0,(c,e)->c+e));

	}

}
