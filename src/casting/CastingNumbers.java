package casting;

public class CastingNumbers {

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<Integer>();
		intBox.add(12);
		intBox.add(11);
		intBox.add(22);
		intBox.add(33);
		System.out.println(intBox.get());
		
	}

}
