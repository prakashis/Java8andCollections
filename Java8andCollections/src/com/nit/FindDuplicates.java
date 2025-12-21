package com.nit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,3,3,4,4,5);
		
		/*Set<Integer> seen=new HashSet<>();
		Set<Integer> duplicates=new HashSet<>();
		
		for(Integer num: list) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		
		System.out.println("duplicates: "+duplicates); */
		
		Set<Integer> moreThanOneElement = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
								.entrySet()
								.stream()
								.filter(e->e.getValue()>1)
								.map(Map.Entry::getKey)
								.collect(Collectors.toSet());
		System.out.println("MoreThan One ELEMENT: "+moreThanOneElement);
		/*
		1. list.stream()                    // Creates stream: 1→2→3→3→3→4→4→5
		2. .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
		   // Groups by element value, counts each: {1=1, 2=1, 3=3, 4=2, 5=1}
		3. .entrySet().stream()             // Stream of map entries: (1,1)→(2,1)→(3,3)→(4,2)→(5,1)
		4. .filter(e -> e.getValue() > 1)   // Keep only counts >1: (3,3)→(4,2)
		5. .map(Map.Entry::getKey)          // Extract keys only: 3→4
		6. .collect(Collectors.toSet())     // Collect to Set: {3, 4}  */

		

	}

}
