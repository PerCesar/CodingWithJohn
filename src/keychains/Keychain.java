package keychains;

import java.util.*;

public class Keychain {
	private HashMap<Keyshape, ArrayList<Key>> keys = new HashMap<Keyshape, ArrayList<Key>>();
	
	public Keychain() {
	}

public Keychain(Collection<Key> keys) {
	for(Key k : keys) {
		addKey(k);
	}
}

	public boolean addKey(Key key) {
		if(!keys.containsKey(key.shape())) keys.put(key.shape(), new ArrayList<Key>());
		return true;
	}

	public boolean removeKey(Key key) {
		if(keys.containsKey(key.shape()))return keys.get(key.shape()).remove(key);
		return false;
	}

	public int keyCount() {
		int keyCount = 0;
		for(Keyshape keyshape : keys.keySet()) {
			keyCount += keys.get(keyshape).size();
		}
		return keyCount;
	}
//--------------------------------------------------------------
public boolean lock(Door door) {
if (door.isLocked()) return true; // Nothing to do
if(!door.hasKey()) return false;//Door cannot be locked
if(!keys.containsKey(door.key().shape())) return false; //Don't have this key
for(Key k : keys.get(door.key().shape())) {
	if(door.lock(k)) return true;
}
return false; // Sorry, no key locks this door.
}
//--------------------------------------------------------------
public boolean unlock(Door door) {
if (!door.isLocked()) return true; // Nothing to do
if(!door.hasKey()) return true;//Door is already unlocked
if(!keys.containsKey(door.key().shape())) return false; //Don't have that key
for(Key k : keys.get(door.key().shape())) {
	if(door.unlock(k)) return true;
}
return false; // Sorry, no key unlocks this door.
}
}

//Initially, instead of HashMap, we used set. This was done bc the goal was to to organize our Keychain so that same-shaped keys are together; also, occasionally we need to hold duplicate keys. Hence, the collection of HashMap is more befitting for these goals bc we need a collection that allows us to organize our keys by shape. 
