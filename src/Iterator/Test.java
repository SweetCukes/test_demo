package Iterator;

public class Test {

	public static void main(String[] args) {
		String s = "hello";
		String t = "hello";
		char c[] = {'h','e','l','l','o'};
		/* ==是比较两个内存地址是否相同，相同为true，不相同为false
		在字符串缓存区中，若已有字符串，则直接赋值时不再新创建一个字符串，如果是new关键字，
		则
		
		*/
		System.out.println(s.equals(t));
		System.out.println(t.equals(c));
		System.out.println(s==t);
		System.out.println(t.equals(new String("hello")));
	}
}
