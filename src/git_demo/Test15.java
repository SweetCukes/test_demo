package git_demo;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[]	strs = str.split(","); //正则表达式进行分割
		int[] is = new int[strs.length];
		scanner.close();
		for (int i = 0; i < is.length; i++) {
			is[i] = Integer.parseInt(strs[i]);
		}
		
//		SortNumUtils.sortNum(is);
		
		
	}
}
