package com.nit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveElementsAnotherCollection {
	
	public static List<Integer> removeAnotherCollection(List<Integer> l,Set<Integer> s){
		
		return l.stream().filter(e->s.contains(e)).collect(Collectors.toList());
		
	}
 
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,5,6,7,8);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		Set<Integer> set=new HashSet<>(list2);
		System.out.println("Remove the elements from another list: "+removeAnotherCollection(list1,set));
		
		
		
		
		
	}

}
