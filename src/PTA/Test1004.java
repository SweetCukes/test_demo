package PTA;

import java.util.Scanner;

public class Test1004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String arr[][] = new String[n][3];
		
		int score[]	 = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.next();
			}
			
			 score[i] = Integer.parseInt(arr[i][2]);
		}
		
//		for (int i : score) {
//			System.out.println(i);
//		}
		 int max, min, namemax, namemin;
	        max = min = score[0];
	        namemax = namemin = 0;
	        
	        //依据数据个数n(即一维数组长度或数据个数)，进行for循环
	        for (int i = 0; i < n; i++) {
	            //比较最大成绩和调换名字顺序
	            if (score[i] > max) {
	                max = score[i];
	                namemax = i;
	            }
	            //比较最小成绩和调换人名顺序
	            if (score[i] < min) {
	                min = score[i];
	                namemin = i;
	            }
	            }
	        System.out.println(arr[namemax][0] + " " + arr[namemax][1]);
	        System.out.println(arr[namemin][0] + " " + arr[namemin][1]);
	    } 
	}

