package dgsw.y2.c1.n11.thread;

public class ThreadLab {
	
	public static void main(String[] args) {
		System.out.println("Step 1");
		
		FirstThread firstThread = new FirstThread();
		firstThread.start();
//		firstThread.run();
		
		try {
			Thread.sleep(3000L);
			firstThread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Step 2");
	}
}
