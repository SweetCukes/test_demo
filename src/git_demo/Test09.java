package git_demo;

import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		 int n=0;
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         s.close();
         int hundreds_place=n/100;
         int decade=(n-hundreds_place*100)/10;
         int unit=n%10;
         for (int i = 1; i <= hundreds_place; i++) {
             System.out.print("B");
         }
         for (int i = 1; i <= decade; i++) {
             System.out.print("S");
         }
         for (int i = 1; i <= unit; i++) {
             System.out.print(i);
         }
	}
}
