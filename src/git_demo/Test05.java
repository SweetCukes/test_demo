package git_demo;

import java.util.Scanner;

public class Test05 {

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
	
	public static void main(String[] args) {
		int k = input();
		int[] arrayNumber = insertNum(k);
		SortNumUtils.sortNum(arrayNumber);
	}

	public static int[] insertNum(int k) {
		int[] arrayNumber = new int[k];
		//填入随机的十个整数
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print("请输入填入的第"+(i+1)+"个数字：");
			arrayNumber[i] = scanner.nextInt();
		}
		System.out.println("改变前数组为：");
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print(arrayNumber[i]+"，");
		}
		return arrayNumber;
	}

//	private static int[] sortNum(int[] arrayNumber) {
//		for (int i = 0; i < arrayNumber.length; i++) { //外层控制循环次数
//			for (int j = 0; j < arrayNumber.length-i-1; j++) {
//				if (arrayNumber[j]>arrayNumber[j+1]) {
//					int temp = arrayNumber[j];
//					arrayNumber[j] = arrayNumber[j+1];
//					arrayNumber[j+1] = temp;
//				}
//			}
//		}
//		return arrayNumber;
//	}
}
