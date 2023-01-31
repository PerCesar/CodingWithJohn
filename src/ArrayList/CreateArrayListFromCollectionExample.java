package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		//Creating an ArrayList from another collection. The goal is to add more elements to an existing list of items.
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimerNumbers = new ArrayList<>();
		nextFivePrimerNumbers.add(13);
		nextFivePrimerNumbers.add(17);
		nextFivePrimerNumbers.add(19);
		nextFivePrimerNumbers.add(23);
		nextFivePrimerNumbers.add(29);

		//Then add the entire collection to a new ArrayList
		firstTenPrimeNumbers.addAll(nextFivePrimerNumbers);
		
		System.out.println(firstTenPrimeNumbers);

		
	}

}
