package git_demo;

import java.util.Scanner;

/**
 * 输入数字的工具类
 * @author ashikotakeshi
 *
 */
public class IntnumUtils {

	public static int inputintNum() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("您要输入的数字是？");
				int num;
				sc.hasNextInt();
				num= sc.nextInt();
				sc.close();
				return num;
			} catch (Exception e) {
				System.out.println("输入的不是数字，请重新输入");
				continue;
			}
		}
	}
}
