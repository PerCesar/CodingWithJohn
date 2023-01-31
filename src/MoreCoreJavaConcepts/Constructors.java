package MoreCoreJavaConcepts;

public class Constructors {
	public static void main(String[] args) {
		
		Dog MyDog = new Dog();
		Dog YourDog = new Dog(3);
		
		MyDog.name="Fido";
		MyDog.age=13;
		MyDog.breed="Golden Retriever";
		MyDog.color="blue";
		
		
		System.out.println(MyDog.numberOfLegs);
		System.out.println(YourDog.numberOfLegs);
		System.out.println("My dog name is: "+MyDog.name);
		
		//no need to add the print out fx as it has already been defined in the method's source from another class.
		MyDog.bark();

		//constructors generate instances of a class with all of its defined properties.
	}
}
