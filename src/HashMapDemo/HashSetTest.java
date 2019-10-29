package HashMapDemo;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(1);
		System.out.println(hashSet.size());
		HashMap<Integer, Person> hashMap = new HashMap<Integer, Person>();
		Person person = new Person("李白",1);
		hashMap.put(23, person);
		hashMap.put(234, person );
		System.out.println(hashMap.size());
	}
}
