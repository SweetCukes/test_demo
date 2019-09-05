package git_demo;

public class Test06 {


	public static void main(String[] args) {
		int k = Test05.input();
		int[] arrayNumber = Test05.insertNum(k);
		int low = 0;
		int high = arrayNumber.length;
		SortNumUtils.sortQuilkNum(low,high,arrayNumber);
	}
}
