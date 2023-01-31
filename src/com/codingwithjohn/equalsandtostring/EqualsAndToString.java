package com.codingwithjohn.equalsandtostring;

import com.codingwithjohn.animals.Dog;

public class EqualsAndToString {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("Fido");
		
		Dog yourDog = new Dog();
		yourDog.setName("Fido");
		
		if(myDog.equals(yourDog)) {
			System.out.println("they are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		System.out.println(myDog);

	
	}

}
