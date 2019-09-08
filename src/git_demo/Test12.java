package git_demo;

/**
 * 铁球落地
 * @author ashikotakeshi
 *
 */
public class Test12 {
	
	public static void main(String[] args) {
		
//		int high = 100,highs = 100;
//		for (int i = 1; i <= 10; i++) {
//			highs = highs + high*2;
//			high = high/2;
//		}
//		System.out.println("反弹"+high);
//		System.out.println("总共"+highs);
//	}
		 double h=100;
	        double s=100;
	        for(int i=1;i<=10;i++) {
	            h=h/2;
	            s=s+2*h;
	        }
	        System.out.println(s);
	        System.out.println(h);
	    }
}
	
