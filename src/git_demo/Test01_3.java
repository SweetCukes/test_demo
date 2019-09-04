package git_demo;

import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;

public class Test01_3{
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
		System.out.println(k);
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[k];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);
		
		
	}
}