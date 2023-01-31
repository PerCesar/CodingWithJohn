package keychains;

import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
	private UUID key;
	private Keyshape shape = Keyshape.Unknown;
	
	//default constructor
	public Key() {
		key = UUID.randomUUID();
	}
	public Key(Keyshape shape) {
		this(); //Initialize key using the default constructor
		this.shape = shape;
	}
	
	//just under the default constructor, I introduce the keyshape code.

	//copy constructor
	public Key (Key original) {
		key = original.key;
		shape = original.shape;
	}
	public Keyshape shape() {
		return shape;
	}
@Override
public Object clone() {
	return new Key(this);
}
	
@Override
public String toString() {
	return key.toString();
}

@Override
public boolean equals(Object obj) {
	if(!getClass().isInstance(obj))return false;
	Key other = (Key)obj;
	return key.equals(other.key);
}

@Override
public int hashCode() {
	return key.hashCode();
}

@Override
public int compareTo(Key o) {
	return key.compareTo(o.key);
}
}

//this code creates and copies a Key. To copy a key you need to implement the cloneable (@Override) interface. To make other keys:
//Key key = new Key();
//Key spareKey = new Key(key);
//Key otherSpareKey = (Key)key.clone();

//To have other keys you need to override equal and haschode and implement Comparable<T>

//this code is also for creating a key item with replicas; a door is still needed.
//It was needed to introduce the enumeration here after intializing it and declaring it into the default and copy constructors. 
//Then we will need code (a collection) that allows us to organize our keys by shape. 