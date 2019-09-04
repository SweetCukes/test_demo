package git_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01_2 {

/**
 * 返回用户数输入的要输入多少个数
 * @return
 */
	public static int input() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("您要输入的数字个数是？");
				int num;
				sc.hasNextInt();
				num= sc.nextInt();
				return num;
			} catch (Exception e) {
				System.out.println("输入的不是数字，请重新输入");
				continue;
			}
		}
	}
	
	public static int intNum() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("您要输入的数字是？");
				int num;
				sc.hasNextInt();
				num= sc.nextInt();
				return num;
			} catch (Exception e) {
				System.out.println("输入的不是数字，请重新输入");
				continue;
			}
		}
	}
	
	public static ArrayList<Integer> insertNum(){
		
		int n = input();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.println("请输入第"+(i+1)+"个数字：");
			arr.add(intNum());
		}
		System.out.println(arr);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n-i-1); j++) {
				if ( (arr.get(j)) > (arr.get(j+1)) ) {
					int temp = arr.get(j);
				}
			}
		}
		
		return (ArrayList<Integer>) arr;
	}
	
	
	public static void main(String[] args) {
	}

	
	
}
