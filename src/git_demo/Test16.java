package git_demo;

import java.util.Scanner;
/**
 * 年月日天数计算
 * @author ashikotakeshi
 *
 */
public class Test16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入年月日：");
		System.out.print("年：");
		int year = scanner.nextInt();
		System.out.print("月：");
		int month = scanner.nextInt();
		System.out.print("日：");
		int day = scanner.nextInt();
		int[] monthsDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (year%4==0) {
			monthsDay[1] = 29;
		}
//		for (int i = 0; i < monthsDay.length; i++) {
//			System.out.println("第"+(i+1)+"个月的天数是："+monthsDay[i]);
//		}
		int days = 0;
		if (month == 1) {
			days = day;
		}else {
			for (int i = 0; i < month-1; i++) {
				days += monthsDay[i];
			}
			days += day;
		}
		System.out.println(year+"年的"+month+"月"+day+"日"+"是这一年的第"+days+"天");
	}
}
