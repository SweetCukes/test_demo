package git_demo;

import java.util.ArrayList;
//判断素数
public class Test04 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			arrayList.add(i);
			int j = 2;
			while (i > j) {
				if (i %j == 0) {
					break;
				}
				j++;
			}
			if (i == j) {
				System.out.println(i);
			}
			
		}
			
		
		
		//System.out.println(arrayList);
	}
}
