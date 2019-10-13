package git_demo;

public class Test06 {


	public static void main(String[] args) {
		String str = "alskdj";
		char[] rts = str.toCharArray();
		String rtss = "";
		for (int i = rts.length-1; i >=0 ; i--) {
			rtss+=rts[i];
		}
		System.out.println(rtss);
		
		System.out.println(str.concat(rtss));
	}
}
