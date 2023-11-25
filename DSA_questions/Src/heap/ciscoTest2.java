package heap;

public class ciscoTest2 {

	static int N;
	static int i;

	public static void main(String[] args) {
		N = 11;
		i = 1;
		Thread t1 = new Thread(new OddThread());
		Thread t2 = new Thread(new EvenThread());
		t1.start();
		t2.start();
	}

}

class EvenThread implements Runnable {

	@Override
	public void run() {
		printEvenNumbers();
	}

	private synchronized void printEvenNumbers() {

		while (ciscoTest2.i < ciscoTest2.N) {
			if (ciscoTest2.i % ciscoTest2.N != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(ciscoTest2.i);
			ciscoTest2.i++;
			notify();
		}
	}

}

class OddThread implements Runnable {

	@Override
	public void run() {
		printOddNumbers();
	}

	private synchronized void printOddNumbers() {
		while (ciscoTest2.i < ciscoTest2.N) {
			if (ciscoTest2.i % ciscoTest2.N == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(ciscoTest2.i);
			ciscoTest2.i++;
			notify();
		}
	}

}
