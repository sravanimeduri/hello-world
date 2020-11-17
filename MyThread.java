package javabasics;

public class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is ="+ i);
		}
	}

	public static void main(String[] args) {
		MyThread nt=new MyThread();
		nt.start();
		for(int x=0;x<=10;x++) {
			System.out.println("x value is ="+ x);
		}
	}

}
