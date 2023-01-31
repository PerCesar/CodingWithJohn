package com.codingwithjohn.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<String> names = new ArrayList();
		
		names.add("Jerry");
		names.add("Jose");
		names.add(0, "Mary");
		names.add("Kate");

		
		
		System.out.println(names);
	}

}
