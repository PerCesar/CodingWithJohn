package ProgrammingLogicInJava;

public class Methods {

	public static void main(String[] args) {

		int num1 = 8;
		int num2 = 11;
		
		int total = add(num1, num2);
		
		System.out.println("the total is: "+total);
		
		sayHi();
	}
		private static void sayHi() {
			System.out.println("Hi");
		}
		
		private static int add(int firstNum, int secondNum) {
			return firstNum + secondNum;
		}
	}
