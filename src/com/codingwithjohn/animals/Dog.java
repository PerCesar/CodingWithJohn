package com.codingwithjohn.animals;

public class Dog extends Animal {
	private int walkDistancePreference;
	
	public void bark() {
		System.out.println("woof woof woof");
	}
	public void eat() {
		System.out.println("yum yum yum");
	}

	public int getWalkDistancePreference() {
		return walkDistancePreference;
	}

	public void setWalkDistancePreference(int walkDistancePreference) {
		this.walkDistancePreference = walkDistancePreference;
	}
	
	
}
