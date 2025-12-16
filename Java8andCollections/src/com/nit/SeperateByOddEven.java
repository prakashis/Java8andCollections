package com.nit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeperateByOddEven {
	
	public static Map<String, List<Integer>> partitionByOddEven(List<Integer> list){
		
		//using collections and its methods
//		HashMap<String, List<Integer>> hashMap = new HashMap<>();
//		hashMap.put("even", new ArrayList<>());
//		hashMap.put("odd", new ArrayList<>());
//		
//		for(int num:list) {
//			if(num%2==0) {
//				hashMap.get("even").add(num);
//			}else {
//				hashMap.get("odd").add(num);
//			}
//			
//		}
		
		Map<Boolean, List<Integer>> partitioned = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		HashMap<String, List<Integer>> hashMap = new HashMap<>();
		hashMap.put("even", partitioned.get(true));
		hashMap.put("odd", partitioned.get(false));
		
		
		return hashMap;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number how many entries you want: ");
		
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter the numbers one by one: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		 
		List<Integer> asList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("OriginalList: "+asList);
		System.out.println("SeperateOddEven: "+partitionByOddEven(asList));
		
	}

}
