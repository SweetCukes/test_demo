package git_demo;

import java.util.Scanner;

/**
 * java统计英文字母，空格，数字和其他字符的个数
 * @author ashikotakeshi
 *
 */
public class Test03 {

	@SuppressWarnings("unused")
	private static void calCul() {
		Integer abcAccount = 0;
		Integer spaceAccount = 0;
		Integer numAccount = 0;
		Integer otherAccount = 0;
		System.out.println("请输入要计算的字符串：");
		Scanner input = new Scanner(System.in	);
		String sb = input.nextLine();
		char [] ch = sb.toCharArray();	//将字符串转化为字符数组
		
		for(int i=0;i<ch.length;i++) {
            if(Character.isLetter(ch[i])) {
            	abcAccount++;	//如果包含字符（返回正确，则+1
            }else if(Character.isDigit(ch[i])) {
            	numAccount++;
            }else if(Character.isSpaceChar(ch[i])){
            	spaceAccount++;
            }else {
            	otherAccount++;
            }
		}
		System.out.println("字符个数为："+abcAccount);
		System.out.println("数字个数为："+numAccount);
		System.out.println("空格个数为："+spaceAccount);
		System.out.println("其他个数为："+otherAccount);
	}
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();	//计算程序开始时间
		calCul();
		long t2 = System.currentTimeMillis(); //计算程序结束时间	
		System.out.println("程序耗时："+ (t2-t1)/1000 +"ms");
	}
}
