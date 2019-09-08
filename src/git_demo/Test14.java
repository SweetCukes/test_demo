package git_demo;

import java.util.Scanner;
/**
 * 三种字符串的拼接方法
 * @author ashikotakeshi
 *
 */
public class Test14 {
	//第一种方法：使用+
		public static  String mergedString1(String string1,String string2) {
			return   string1 + string2;
		}
		
		//第二种：使用concat()；
		public static String mergedString2(String string1, String string2) {
			return string1.concat(string2);
		}
		
		//第三种：使用append()；
		public static  StringBuffer mergedString3(String string1, String string2) {
			StringBuffer sb = new StringBuffer(string1);
			return sb.append(string2);
			
		}
	 
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("请输入字符串1:");
			String string1 = input.nextLine();
			System.out.print("请输入字符串2:");
			String string2 = input.nextLine();
			input.close();
			
			long s1 = System.currentTimeMillis();
			for (int i = 0; i < 100; i++) {
				mergedString1(string1, string2);
			}
			long s2 = System.currentTimeMillis();
			System.out.println("方法一耗时："+(s2-s1));
			
	}

}
