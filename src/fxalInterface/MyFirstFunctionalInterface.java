package fxalInterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface {
	//this is an abstract method
	public void square(int a);
	
	
	//this is a default method
	default void show() {
		System.out.println("Default method executed");
	}
}
