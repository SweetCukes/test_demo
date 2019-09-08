package git_demo;

public class Test17 {

	public static void main(String[] args) {
		mystery(1234);
	}

	private static void mystery(int i) {
		System.out.print( i %10);
		
		if ((i / 10) != 0) {
			mystery(i / 10);
		}
		System.out.print(i % 10);
	}
	
	private static void Test() {
		float t = 5.1f;
		int i = (byte) t;
		
	}
}
