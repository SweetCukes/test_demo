package HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		function_1();
		function_2();
	}

	private static void function_2() {
		
	}

	//HashMap存储自定义的对象Person，作为值出现
	//键的对象，是字符串，可以保证唯一性
	private static void function_1() {
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("beijing", new Person("ABC",23));
		map.put("shanghai", new Person("ui",23));
		map.put("shenzhen", new Person("ibai",23));
		
		for (String key : map.keySet()) {
			Person valuePerson = map.get(key);
			System.out.println(key+"..."+valuePerson);
		}
		
		System.out.println("==============");
		for (Map.Entry<String, Person> entry:map.entrySet()) {
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key+"..."+value);
		}
	}
	
	//HashMap
}


