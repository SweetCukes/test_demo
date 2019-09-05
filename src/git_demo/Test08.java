package git_demo;

public class Test08 {
	public static void main(String[] args) {
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i]  = (int)(1000*Math.random());
		}
		
		int[] b = new int[10];
		for (int j = 0; j < b.length; j++) {
			for (int k = 0,sum = 0; k < a.length; k++) {
				if (a[k]%10 == j) {
					sum++;
				}
				b[j] = sum;
				System.out.println("a数组中对10求余等于"+b[j]+"的个数为："+sum);
			}
		}
		
	}
}
