package com.nit;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,6);
		int n=list.size()+1;
		
		/* int expectedSum=n*(n+1)/2;
		int sum=0;
		for(int num:list) {
			sum+=num;
			  
		}
		
		System.out.println("Missing Number: "+(expectedSum-sum)); */
		
		int expectedSum=n*(n+1)/2;
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("Missing Number: "+(expectedSum-sum));
		
		

	}

}
