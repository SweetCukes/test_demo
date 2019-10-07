package algorithm;

public class charu {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
		}
		SortNumBer(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	private static int[] SortNumBer(int a[]) {
		if (a.length == 0) {
			return a;
		}
		int current;
		for (int i = 0; i < a.length-1; i++) {
			current = a[i+1];
			int preIndex = i;
			while (preIndex >= 0 && current<a[preIndex]) {
				a[preIndex+1	] = a[preIndex];
				preIndex -- ;
			}
			a[preIndex +1]  = current;
		}
		return a;
	}
}
