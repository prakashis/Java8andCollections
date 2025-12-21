package com.nit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOccurenceOfNames { 

	public static void main(String[] args) {
		List<String> names=Arrays.asList("ramu","rowdy","raju","ramu","rowdy");
		HashMap<String, Integer> hashMap = new HashMap<>();
		System.out.println("Original Array: "+names);
		for(String name:names) {
			hashMap.put(name, hashMap.getOrDefault(name, 0)+1);
			
		}
		
		System.out.println("hashMap: "+hashMap);
			
		

	}

}
