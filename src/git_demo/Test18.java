

package git_demo;

public class Test18 extends Thread{
	
//	public static void main(String[] args) {
//		StringBuffer buffer = new StringBuffer("a");
//		StringBuffer buffer2 = new StringBuffer("b");
//		operate(buffer,buffer2);
//		System.out.println(buffer+","+buffer2);
//	}
//
//	private static void operate(StringBuffer buffer, StringBuffer buffer2) {
//		buffer.append(buffer2);
//		buffer = buffer2;
//	}
	
//	 public static void main(String[] args) {
//		 Test18 t=new Test18();
//		 Test18 s=new Test18();
//	        t.start();
//	        System.out.println("one.");
//	        s.start();
//	        System.out.println("two.");
//	    }
//	    public void run() {
//	        System.out.println("Thread");
//	    }
	
	
	@Override
	public int hashCode() {
		int x = 90;
		return x;
	}
	
	
	
	public static void main(String[] args) {
		String str = "纷乱雪月花，一刀五万八";
		String rts = "";
		char[] cs = str.toCharArray();
		for (int i = cs.length-1; i >= 0 ; i--) {
			rts += cs[i];
		}
		String strrts = str.concat(rts);
		System.out.println("字符串改前为："+str);
		System.out.println("字符串改后为："+rts);
		System.out.println("字符串连接为："+strrts);
		int fen = strrts.indexOf("纷")+1;
		System.out.println("纷在字符串中的位置为：第"+fen+"位");
		System.out.println(strrts.toString());
		
		
		
		
		
		
		
//		StringBuffer sb = new StringBuffer("纷乱雪月花，一刀五万八");
//		StringBuffer sb2 = sb.reverse();
//		System.out.println(sb2);
	}
	
}
