package Thread;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();

		Thread t2 = new Thread(new Mythread1());

		t2.start();

		Counter counter = new Counter();
		CounterThread t3 = new CounterThread(counter);
		CounterThread t4 = new CounterThread(counter);

		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final count: " + counter.getCount());
	}
}
