package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		List<String> topCompanies = new ArrayList<>();
		
		//Now, check that is empty
		System.out.println("is the topCompanies list empty?: "+topCompanies.isEmpty());
		
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");

		//Now, find the size of ArrayList
		
		System.out.println("is the topCompanies list empty?: "+topCompanies.size());
		System.out.println(topCompanies);
		
		//Now, retrieve the element of a given index
		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		//Now to get the last element from the list of topCompanies
		String lastCompany = topCompanies.get(topCompanies.size()-1);
		
		System.out.println("Best Company: "+bestCompany);
		System.out.println("2nd Best Company: "+secondBestCompany);
		System.out.println("Last Company in the List:" +lastCompany);

		//Modify an element at a given index
		topCompanies.set(4,  "Walmart");
		System.out.println("Modified top companies list: "+topCompanies);
	}

}
