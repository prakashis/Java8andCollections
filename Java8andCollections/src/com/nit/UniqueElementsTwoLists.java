package com.nit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueElementsTwoLists {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,1,1,2,30,30,30);
		List<Integer> list2 = Arrays.asList(1,50,60,50,60);
		
		HashSet<Object> set1 = new HashSet<>(list1);
		HashSet<Object> set2 = new HashSet<>(list2);
		
		HashSet<Object> onlyInFirst = new HashSet<>(set1);
		onlyInFirst.removeAll(set2);
		
		HashSet<Object> onlyInSecond = new HashSet<>(set2);
		onlyInSecond.removeAll(set1);
		
		HashSet<Object> res = new HashSet<>(onlyInFirst);
		res.addAll(onlyInSecond);
		
		System.out.println("Find Unique Elemets: "+(res));
		
		
		
		
		
		
		

	}

}
