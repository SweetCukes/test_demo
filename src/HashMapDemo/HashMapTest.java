package HashMapDemo;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("tony", 1233445566);
		map.put("kevin", 123344556);
		map.put("baike", 39021);
		
		System.out.println(map);
		System.out.println("====================================================");
		
		int result =  (int) map.get("tony");
		System.out.println(result);
		System.out.println("====================================================");
		
		/**
		 * 遍历值
		 */
		System.out.println("遍历值");
		for(Object key:map.keySet()) {
			int value  = (int) map.get(key);
			System.out.println(key+"："+value);
		}
		System.out.println("====================================================");
		/**
		 * 查询是否有这个值
		 * 
		 */
		System.out.println("这个数组中是否有tony这个值："+map.containsKey("tony"));
		map.put("tony", 9867483);
		for (Object keyObject : map.keySet()) {
			int value = (int) map.get(keyObject);
			System.out.println(keyObject+""+value);
		}
	}
}
