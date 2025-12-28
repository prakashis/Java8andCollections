package com.nit;

import java.util.HashSet;
import java.util.Set;

public class Subset {
	
	public static boolean isSubset(Set<String> subset, Set<String> superset) {
		//return superset.containsAll(subset);
		
		for(String e:subset) {
			if(!superset.contains(e)) {
				System.out.println("Elements are not matching:");
				return false;
			}
		}
		System.out.println("Elements are matching:");
		return true;
	}

	public static void main(String[] args) {
		HashSet<String> subset = new HashSet<String>();
		subset.add("sristi");
		subset.add("madhu");
		subset.add("roe");
		
		HashSet<String> superset = new HashSet<String>();
		superset.add("prakash");
		superset.add("roe");
		superset.add("madhu");
		superset.add("sristi");
		superset.add("chinni");
		superset.add("issak");
		
		System.out.println(isSubset(subset,superset));
		

	}

}
