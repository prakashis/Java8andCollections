package com.nit;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<Object> list=Arrays.asList(1,3,5,3,2,3,3,2,2,5,5,6,8,8,9,0);
		System.out.println("Original list: "+list);
//		List<Object> afterRemovingDuplicates = list.stream().distinct().collect(Collectors.toList());
//		System.out.println("AfterRemovingDuplicates: "+afterRemovingDuplicates);

		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>(list);
		System.out.println("linkedHashSet: "+linkedHashSet);
		

	}

}
