package fxalInterface;

public class UsingDefaultMethods implements MyFirstFunctionalInterface {

	public static void main(String[] args) {
		UsingDefaultMethods FID = new UsingDefaultMethods();
		FID.square(10);
		FID.show();
	}

	@Override
	public void square(int a) {
		System.out.println(a*a);
	}

}
