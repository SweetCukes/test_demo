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
	
	public static int insertNum(){
		
		int n = input();
		int[] arr = new int[n];
		for (int i = 1; i < (n+1); i++) {
			System.out.println("请输入第"+(i+1)+"个数字：");
			arr[i] =  intNum();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr[n];
		
	}
	
	
	public static void main(String[] args) {
		insertNum();
	}

	
	
}
