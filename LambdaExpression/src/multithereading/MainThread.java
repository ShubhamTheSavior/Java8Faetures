package multithereading;

public class MainThread {
	public static void main(String[] args) {
		/*
		 * MyRunnable muRunnable=new MyRunnable(); Thread t1=new Thread(muRunnable);
		 * t1.start();
		 * 
		 * for(int i=0;i<10;i++) { System.out.println("main thread"); }
		 */
		
		
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("child thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}
}
