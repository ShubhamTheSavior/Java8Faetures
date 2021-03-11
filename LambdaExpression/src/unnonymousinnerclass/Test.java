package unnonymousinnerclass;

public class Test {

	public static void main(String[] args) {
		
		Runnable r=new Runnable() { 
			//new Runnable() is not object of Runnable interface is is an object of its implementation class
			//because inner class is unonymous
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("child thread");
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
