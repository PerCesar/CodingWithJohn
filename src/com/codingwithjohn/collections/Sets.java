package com.codingwithjohn.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Jerry");
		names.add("Jose");
		names.add("Mary");
		names.add("Kate");
		
		names.add("Jerry");

		
		System.out.println(names);
		
		
	}

}
