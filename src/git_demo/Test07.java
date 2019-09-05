package git_demo;

import java.util.ArrayList;
/**
 * 输入一个数字的个数，输出以个数个数的数组，平均数，低于平均数，并且以从小到大的顺序输出
 * @author ashikotakeshi
 *
 */
public class Test07 {
	
	

	public static void main(String[] args) {
		int[] scores = new int[IntnumUtils.inputintNum()];
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 100);
			count = count + scores[i];
//			if (i == scores.length-1) {
//				System.out.println(scores[i]);
//			}else {
//				System.out.print(scores[i]+"，");
//			}
		}
		int averrage = count/scores.length;
		System.out.println("平均分为：" +averrage);
		int num = 0;
		ArrayList<Integer> unscores  = new ArrayList<Integer>();
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < averrage) {
				num++;
				unscores.add(scores[i]);
			}
		}
		System.out.println("低于平均分有："+num+"个");
		System.out.println("分别为："+unscores);
		
		int[] unscoresList = new int[num];
		for (int i = 0; i < unscoresList.length; i++) {
			unscoresList[i] = unscores.get(i);
		}
		
		SortNumUtils.sortNum(unscoresList);
//		System.out.println("排序后数组为：");
//		for (int i = 0; i < unscoresList.length; i++) {
//			
//			if (i == unscoresList.length) {
//				System.out.print(unscoresList[i]);
//			}else {
//				System.out.print(unscoresList[i] + "，");
//				
//			}
//		}
	}
}
