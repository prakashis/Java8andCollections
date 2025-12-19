package com.nit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergesTwoLists {
	
	public static List<Integer> mergeSortedList(List<Integer> list1,List<Integer> list2){
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		int i=0,j=0;
		
		while(i<list1.size() && j<list2.size()) {
			if(list1.get(i)<=list2.get(j)) {
				arrayList.add(list1.get(i));
				i++;
				
			}else {
				arrayList.add(list2.get(j));
				j++;
			}
		}
		
		while(i<list1.size()) {
			arrayList.add(list1.get(i++));
		}
		
		while(j<list2.size()) {
			arrayList.add(list2.get(j++));
		}
		
		return arrayList;
	}

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(5,6,7,8);
		System.out.println(mergeSortedList(list1,list2));
		

	}

}
