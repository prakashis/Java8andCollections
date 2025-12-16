package com.nit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,2,2,5,6,7,8,9);
		System.out.println("Original list: "+list);
		Collections.reverse(list);
		System.out.println("After reverse the list: "+list);
		
		//manual process 
//		int left=0,right=list.size()-1;
//		
//		while(left<right) {
//			Integer temp = list.get(left);
//			list.set(left, list.get(right));
//			list.set(right, temp);
//			left++;
//			right--;
//		}
//		System.out.println(list);
		

	}

}
