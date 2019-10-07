package algorithm;

import git_demo.SortNumUtils;

public class maopao {
	
	
	public static void main(String[] args) {
	
		int[] a = new int[10];
		for (int i = 0; i < 10 ; i++) {
			a[i] =  (int) (Math.random()*100);
			System.out.println("a"+i+"是："+a[i]);
		}
		
		SortNumBer(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	private static int[] SortNumBer(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
