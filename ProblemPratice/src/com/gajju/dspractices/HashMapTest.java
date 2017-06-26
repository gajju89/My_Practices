package com.gajju.dspractices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("hi");
		list.add("collection");
		Map<Object,Object> map=new HashMap<Object,Object>();
		map.put("100", "Rajesh");
		map.put(new Integer("100"), "Dilip");
		map.put(new String("100"), "Gajendra Singh");
		map.put(new Integer("100"), "Gajju");
		map.put("100", list);
		System.out.println(map);

	}

}
