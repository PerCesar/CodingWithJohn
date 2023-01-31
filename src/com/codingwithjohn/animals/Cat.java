package com.codingwithjohn.animals;

public class Cat extends Animal {
	private String litterPreference;
	
	public void meow() {
		System.out.println("Meow");
	}
	public void eat() {
		System.out.println("nom nom nom");
	}

	public String getLitterPreference() {
		return litterPreference;
	}

	public void setLitterPreference(String litterPreference) {
		this.litterPreference = litterPreference;
	}
	
	
}
