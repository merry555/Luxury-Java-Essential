package 실습;

public class CountingThreadConsole {
	public static void main(String[] args) {
		Thread th = new Thread(new CountingThread());
		th.start();
		try {
			th.join();
		} catch(InterruptedException e) {
			return;
		}
	}
}

class CountingThread implements Runnable {
	public void run() {
		for(int i=0; i<=100; i++)
			System.out.println(i);
	}
}