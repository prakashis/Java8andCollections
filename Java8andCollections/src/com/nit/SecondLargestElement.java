package com.nit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,56,7,44,5,55,77,99);
		Integer integer = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println("Second Largest Integer in an array: "+integer);

	}

}
