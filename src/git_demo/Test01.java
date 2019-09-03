package git_demo;

public class Test01 {
	
	
	public int[] sortNum(int[] num) {
		for (int i = 0; i < num.length; i++) { //外层控制循环次数
			for (int j = 0; j < num.length-i-1; j++) {
				if (num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[+1];
					num[j+1] = temp;
				}
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,4,6,3,7,8,67,6,342,45,454,345,44};
		System.out.println("排序前数组为：");
		for(int num:arr) {
			System.out.print(num +",");
		}
		Test01 ts = new Test01();
		ts.sortNum(arr);
		System.out.println();
		System.out.println("排序后的数组为：");
		for(int num:arr	) {
			System.out.print(num+",");
		}
	}
}
