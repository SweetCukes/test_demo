package offer;

public class Test001 {

	public static void main(String[] args) {
		String k = new String("test ok");
		String str = replaceSpace(k);
		System.out.println(str);
	}

	private static  String  replaceSpace(String k) {
		
		char[] test = k.toCharArray();
		int i = 0;
		int lengthSpace = 0;
		while (i<test.length) {
			if (test[i] == ' ') {
			lengthSpace++;
			i++;	
			}
		}
		int newlength = test.length+lengthSpace*2;
		char[] newStr = new char[newlength];
		int j  = newlength-1;
		i = test.length-1;
		while (i>=0) 
		{
			if(test[i] !=  ' ')
			            {
				                newStr[j--] = test[i--];
				            }else{
				            	newStr[j--] = '0';
				                newStr[j--] = '2';
				                newStr[j--] = '%';
				                i--;
				            }
		}
		return new String(newStr);
		
	}
}
