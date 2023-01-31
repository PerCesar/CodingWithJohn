package com.codingwithjohn.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		Map <Integer, String> employees = new HashMap<>();
		employees.put(12345, "John");
		employees.put(12245, "George");
		employees.put(13345, "Kramer");
		employees.put(12445, "Newman");

		
		
		System.out.println(employees);
		
		
	}

}
