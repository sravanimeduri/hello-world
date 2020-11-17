package javabasics;

import java.util.Scanner;

public class AliveEx2 extends Thread{
	int x,y;
	public void run() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter x,y values");
		x=sc.nextInt();
		y=sc.nextInt();
	}

	public static void main(String[] args) throws InterruptedException {	
		
		AliveEx2 t=new AliveEx2();
		
				
		t.start();
		t.join();
		System.out.println("Sum ="+t.x+t.y);

	}

}
