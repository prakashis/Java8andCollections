package com.nit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairsSum {
	
	public static List<List<Integer>> findPairsWithSum(List<Integer> list,int target){
		Set<Integer> seen=new HashSet<>();
		Set<List<Integer>> res=new HashSet<>();		
		for(int num:list) {
			int complement=target-num;
			if(seen.contains(complement)) {
				List<Integer> pair=Arrays.asList(
						Math.min(num, complement),Math.max(num, complement)
						);
				
				res.add(pair);
			}
			
			seen.add(num);
			
		}
		return new ArrayList<>(res);
		
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);	
		System.out.println(findPairsWithSum(list,6));
	}

}
