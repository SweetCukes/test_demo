package Iterator;

import java.util.ArrayList;
import java.util.Collection;

import HashMapDemo.Key;
import git_demo.IntnumUtils;

public class IteratorTest {
	public static void main(String[] args) {
		
		Collection<Key> collection = new ArrayList<Key>();
		Key key1 = new Key();
		int x = IntnumUtils.inputintNum();
		for (int i = 0; i < x; i++) {
			key1.setId(i);
			collection.add(key1);
			System.out.println(collection);
		}
		
	
		
		
		
	}
}
