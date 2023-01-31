package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

	public static void main(String[] args) {
	//Create an ArrayList of String
	List <String> animals = new ArrayList<>();
	
	//Once list created, add elements to it
	animals.add("Lion");
	animals.add("Tiger");
	animals.add("Cat");
	animals.add("Dog");
	
	System.out.println(animals);

	//ArrayList allows the addition of elements at spc index
	animals.add(2, "Elephant");
	System.out.println(animals);
		
	}

}
