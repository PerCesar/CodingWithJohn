package MoreCoreJavaConcepts;

public class Arrays {

	public static void main(String[] args) {
		
		
//int, double, any other data type really can be used as an array just work with the different type of array. 
		String [] cars = {"Toyota", "Honda", "Chevrolet", "Chrysler"};
		
		//this loop goes from 3 to zero in the reverse order of the array
//		for(int i = cars.length -1; i >= 0 ; i--) {
//			System.out.println(cars[i]);
		
//	for(int i = 0; i < cars.length ; i++) {
//			System.out.println(cars[i]);

		
		//for iteration through the array it is put in the car variable to be referred inside the for loop.The car variable will have a different value each time.
		for(String car: cars) {
			System.out.println(car);
		}
	}

}
