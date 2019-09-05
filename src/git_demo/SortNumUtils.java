package git_demo;

/**
 * 排序的一个工具方法，
 * 以后如果要使用冒泡排序直接使用这个方法就可以了
 * @author ashikotakeshi
 *
 */
public class SortNumUtils {

	public static int[] sortNum(int[] arrayNumber) {
		for (int i = 0; i < arrayNumber.length; i++) { //外层控制循环次数
			for (int j = 0; j < arrayNumber.length-i-1; j++) {
				if (arrayNumber[j]>arrayNumber[j+1]) {
					int temp = arrayNumber[j];
					arrayNumber[j] = arrayNumber[j+1];
					arrayNumber[j+1] = temp;
				}
			}
		}
		System.out.println("改变后数组为：");
		for (int i = 0; i < arrayNumber.length; i++) {
			
			if (i == (arrayNumber.length)) {
				System.out.print(arrayNumber[i]);
			}else {
				System.out.print(arrayNumber[i]+"，");
			}
		}
		return arrayNumber;
	}

	public static void sortQuilkNum(int low, int high, int[] arrayNumber) {

				// 当low==high是表示该序列只有一个元素，不必排序了
				if (low >= high) {
					for (int i = 0; i < arrayNumber.length; i++) {
						System.out.println(arrayNumber[i]);
					}
					return;
				}
				// 选出哨兵元素和基准元素。这里左边的哨兵元素也是基准元素
				int i = low, j = high, base = arrayNumber[low];
				while (i < j) {
					// 右边哨兵从后向前找
					while (arrayNumber[j] >= base && i < j) {
						j--;
					}
					// 左边哨兵从前向后找
					while (arrayNumber[i] <= base && i < j) {
						i++;
					}
					swap(arrayNumber, i, j); // 交换元素
				}
				swap(arrayNumber, low, j); // 基准元素与右哨兵交换

				// 递归调用，排序左子集合和右子集合
				sortQuilkNum(j-1,low,arrayNumber);
				sortQuilkNum(high, j + 1, arrayNumber);

			}

			private static void swap(int[] arrayNumber, int i, int j) {
				int tmp = arrayNumber[i];
				arrayNumber[i] = arrayNumber[j];
				arrayNumber[j] = tmp;
			}
	

	

}
