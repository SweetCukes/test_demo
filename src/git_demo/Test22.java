package git_demo;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		System.out.print("请输入要查询的数字：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		int k =2;
		System.out.print(num+"=");
		while(k<=num) {
			if (k==num) {
				System.out.print(k);
				break;
			}else if(num%k==0) {
				System.out.print(k+"*");
				num = num/k;
			}else {
				k++;
			}
		}
	}
}
