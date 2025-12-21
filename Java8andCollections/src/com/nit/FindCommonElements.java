package com.nit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElements {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ram","raj","park","don");
		List<String> list2 = Arrays.asList("ramu","raj","parku","don");
		
		/* HashSet<Object> set1 = new HashSet<>(list1);
		HashSet<Object> set2 = new HashSet<>(list2);
		set1.retainAll(set2);
		System.out.println("Common Elements: "+set1); */
		
		Set<String > modifiedSet = new HashSet<>(list2);
		
		Set<String> collect = list1.stream().filter(modifiedSet::contains).collect(Collectors.toSet());
		
		System.out.println("Common Elements: "+collect);
		
	
	}

}
