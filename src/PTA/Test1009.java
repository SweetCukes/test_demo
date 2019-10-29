package PTA;



public class Test1009 {

	public static void main(String[] args) {
		int count =  0;
//		Scanner scanner = new Scanner(System.in);
//		String toString = scanner.nextLine();
//		scanner.close();
//		char test[] = toString.toCharArray();
		String test1 = "test ok";
		String resultString = sortString(test1);
		for (String test : args) {
			if (test.contains("")) {
				count++;
			}
		}
	}

	private static String sortString(String test1) {
		char[] cs = test1.toCharArray();
		String sc=new String("");
		for (int i = cs.length-1 ; i >=0   ; i--) {
			sc+=cs[i];
		}
		return sc;
	}
	
	
}
