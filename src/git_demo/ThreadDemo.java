package git_demo;

public class ThreadDemo extends Thread{

	String s;
	int m,count = 0;
	 ThreadDemo(String str,int mm) {
		s = str;
		m = mm;
	}
	 @Override
	public void run() {
		 try {
			while (true) {
				System.out.print(s);
				sleep(m);
				count++;
				if (count>=100) {
					break;
				}
			}
			System.out.println("线程"+s+"结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
	}
	 /**
	  * 继承Thread类来进行下面的操作
	  * @param args
	  */
	 public static void main(String[] args) {
		ThreadDemo threadDemo1 = new ThreadDemo("A", 3);
		ThreadDemo threadDemo2 = new ThreadDemo("B", 9);
		threadDemo1.start();
		threadDemo2.start();
	}
}
