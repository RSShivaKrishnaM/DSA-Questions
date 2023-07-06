package arrays.twoPointers;

import java.util.concurrent.atomic.AtomicBoolean;

public class Test {

	public static int N;
	public static AtomicBoolean lock = new AtomicBoolean();

	public static void main(String args[]) {
		N = 10;
//		OddThread t2;
//		t2 = new OddThread(t1);
//		EvenThread t1 = new EvenThread(t2);
		Thread t3 = new Thread(new EvenThread());
		t3.start();
		
		Thread t4 = new Thread(new OddThread());
		t4.start();
		
		
	}

}

class EvenThread implements Runnable {

	private OddThread t2;

//	public EvenThread(OddThread t2) {
//		this.t2 = t2;
//	}

	@Override
	public void run() {
		for (int i = 0; i < Test.N; i++) {
			if (i % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!Test.lock.compareAndExchangeAcquire(false, true)) {
					System.out.print(i);
					Test.lock.compareAndExchangeAcquire(true, false);
					notify();
				}

				
			}
		}

	}

}

class OddThread implements Runnable {

	private EvenThread t1;

//	public OddThread(EvenThread t1) {
//		this.t1 = t1;
//	}

	@Override
	public void run() {
		for (int i = 0; i < Test.N; i++) {
			if (i % 2 != 0) {
				if (!Test.lock.compareAndExchangeAcquire(false, true)) {
					System.out.print(i);
					Test.lock.compareAndExchangeAcquire(true, false);
					notify();
				}
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}