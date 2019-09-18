package PTA;

import java.util.Scanner;

public class Test1003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.next();
			String news = arr[i];
			
			if (news.contains("P")&&(news.contains("T"))&&news.contains("A")) {
				news = news.replace("P", "");
				news = news.replace("T", "");
				news = news.replace("A", "");
				if(news.isEmpty()){
                    
                    int p = arr[i].indexOf("P");
                    int t = arr[i].indexOf("T");
                    int len = arr[i].length();
                    int b = t-p-1;
                   	int c = len -t -1;
                   	if(p*b==c){
                    		System.out.println("YES");
                    	}else{
                    		System.out.println("NO");
                    	}
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}
		}
	}
