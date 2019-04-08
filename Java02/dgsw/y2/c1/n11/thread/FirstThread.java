package dgsw.y2.c1.n11.thread;

public class FirstThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("FirstThread started");
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(900L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("FirstThread - " + i);
		}
		System.out.println("FirstThread ended");
	}
}
