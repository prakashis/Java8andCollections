package com.nit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateListByKPosition {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int k=2;
		
		if(list==null || list.isEmpty()) {
			return;
		}
		
		int n=list.size();
		k=k%n; 
		
		if(k==0) {
			return;
		}
		
		//reverse the entire list
		Collections.reverse(list);
		
		//reverse first k elements
		Collections.reverse(list.subList(0, k));
		
		
		//reverse remaining elements
		Collections.reverse(list.subList(k, n));
		
		
		System.out.println("list: "+list);

	}

}
