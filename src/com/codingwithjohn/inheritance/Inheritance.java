package com.codingwithjohn.inheritance;

import com.codingwithjohn.animals.Animal;
import com.codingwithjohn.animals.Cat;
import com.codingwithjohn.animals.Dog;

public class Inheritance {

	public static void main(String[] args) {

		Animal myAnimal = new Animal();
		myAnimal.eat();
		
		Dog myDog = new Dog();
		myDog.bark();
		myDog.eat();
		
		Cat myCat = new Cat();
		myCat.eat();
	}

}
