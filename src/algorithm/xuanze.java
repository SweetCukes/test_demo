package algorithm;

public class xuanze {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10 ; i++) {
			a[i	] = (int) (Math.random()*100);
		}
		
		
		SortNumBer(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int[] SortNumBer(int[] a) {
		if (a.length == 0) {
			return a;
		}
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = 0; j < a.length; j++) {
				if (a[j] > a[min]) {
					min = j;
				}
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		
		
		return a;
	}
}
