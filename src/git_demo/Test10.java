package git_demo;
/**
 * 判断一个数是否为素数
 * @author ashikotakeshi
 *
 */
public class Test10 {

	public static void main(String[] args) {
		
		int k = IntnumUtils.inputintNum();
		System.out.println("您输入的数字是："+k);
		if (judge(k)) {
			System.out.println("是素数");
		}
		else {
			System.out.println("不是素数");
		}
	}

	private static boolean judge(int inputintNum) {
			if (inputintNum ==1 || inputintNum == 0) {
				return false;
			}
			for (int j = 2; j <=Math.sqrt(inputintNum); j++) {
				if (inputintNum%j == 0) {
					return false;
				}
			}
		return true;
	}
}
