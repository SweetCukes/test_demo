package git_demo;

public class Test20 {

	public static void main(String[] args) {
		addWay();
		concatWay();
		stringbufferWay();
		stringbuilderWay();
		
	}

	private static void stringbuilderWay() {
		StringBuilder stringbuilderWay = new StringBuilder("a");
		long start1 = System.currentTimeMillis();
		for (int i = 0; i <10000 ; i++) {
			stringbuilderWay.append("a");
		}
		System.out.println("StringBuilder方法耗时为："+(System.currentTimeMillis()-start1));
	}

	private static void stringbufferWay() {
		StringBuffer stringbufferWay = new StringBuffer("a");
		long start1 = System.currentTimeMillis();
		for (int i = 0; i <10000 ; i++) {
			stringbufferWay.append("a");
		}
		System.out.println("stringbuffer方法耗时为："+(System.currentTimeMillis()-start1));
	}

	private static void concatWay() {
		String concatWay = new String("a");
		long start1 = System.currentTimeMillis();
		for (int i = 0; i <10000 ; i++) {
			concatWay.concat("a");
		}
		System.out.println("concat()方法耗时为："+(System.currentTimeMillis()-start1));
	}

	private static void addWay() {
		String addway = new String("a");
		long start1 = System.currentTimeMillis();
		for (int i = 0; i <10000 ; i++) {
			addway += "a";
			
		}
		System.out.println("+号耗时为："+(System.currentTimeMillis()-start1));
	}
}
