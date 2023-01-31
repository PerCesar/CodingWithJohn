package casting;

public class CastingLetters {

	public static void main(String[] args) {
		Box<String> intBox = new Box<String>();
		intBox.add("a");
		intBox.add("b");
		intBox.add("c");
		intBox.add("d");
		System.out.println(intBox.get());
		
	}

}

