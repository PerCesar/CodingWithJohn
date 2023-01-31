package MoreCoreJavaConcepts;

public class Dog {
//NOTE: constructors (method) are used to instantiate new objects of a class
//The names of the constructor methods are going to match the name of the classes starting with a capital letter, all other methods start with lower case letter.
		
//we use public as an access level so it can be called by classes outside of this class. By using private you will not be allowed to create objects from private classes.
		
		String name;
		int age;
		String breed;
		String color;
		int numberOfLegs;
		
		
//The constructor is public Dog(). This is an empty constructor. No args constructor. 
		public Dog() {
			this.numberOfLegs = 5;			
		}
		public Dog(int numberOfLegs) {
			this.numberOfLegs = numberOfLegs;
		
		}
		void bark() {
			System.out.println("Bark! My Name is ");
		}
		
	}
