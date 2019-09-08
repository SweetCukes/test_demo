package git_demo;

/**
 * 两种算法求阶层
 * @author ashikotakeshi
 *
 */
public class Test13 {

	public static void main(String[] args) {
		
			//递归算法
		System.out.println("递归算法结果为："+digui(5));
		//循环算法
		System.out.println("循环算法结果为："+xunhuan(5));
	}
	
	public static int digui(int i) {
		if (i == 1) {
			return i;
		}else {
			return i*digui(i-1);
		}
	}
	
	public static int xunhuan(int i) {
		int result=1;
		for (int k=i; k > 1; k--) {
			result *=k;
		}
		return result;
	}
}
