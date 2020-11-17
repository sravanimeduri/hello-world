package javabasics;

public class AliveEx extends Thread{
	public void run() {
		System.out.println("running....."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		AliveEx t1=new AliveEx();
		AliveEx t2=new AliveEx();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("Marvels");
		t2.setName("Avengers");
		
		t1.start();
		t2.start();

	}

}
