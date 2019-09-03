package git_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 水仙花数算法题
 * @author ashikotakeshi
 *
 */
//		思路：指一个三位数，各个位置的数字的立方和等于该数本身
public class Test02 {

	public static void Test() {
		int a,b,c;
		Integer count =  0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 101; i < 1000; i++) {
			//%的结果等于余数
			// /的结果等于商的整数
			a = i /100;		//获取最高位（百位
			b = ( i % 100 ) / 10;	//获取第二位（十位
			c = i % 10;		//获取第一位（个位
			if (a*a*a + b*b*b + c*c*c == i) {
				list.add(i);
				count++;
			} 
			
		}
		System.out.println(count);
			System.out.println(list);
	}
	public static void main(String[] args) {
		Test02.Test();
	}
}
