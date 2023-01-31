package com.codingwithjohn.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		//the try block surrounds the portion of the code that might result in an exception. then after that block, you have a catch block. Inside the catch parenthesis you put the kind of exception you want to catch. We can put in there the type of exception we want to catch like the NumberFormatException.
//The actual exception needs to be named, the convention is to use the first letter of each of the words that compose the exception.
//After the try catch blocks we coded for a printout to test that the code gets to the end.
//Inside the try block if it recognizes an exception, java does not finish the rest of the try block it is thrown out of it before finishing the whole code block. 
//nullpointer exception if used inside the catch block would not work with the numberformatexception and it would produce an error.
//There is an exception hierarchy. All the exception types and subtypes can be caught with X or Y exception. 
		
		
		try {
		int myInt = Integer.parseInt("12");
		}
		catch(NumberFormatException nfe){
		System.out.println("caught a number format exception");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end of the program");
	}

}
