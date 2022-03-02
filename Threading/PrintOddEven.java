package Threading;

public class PrintOddEven {
    int counter = 1;
    static int n;

    public void printOdd() {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        n = 20;
        PrintOddEven printOddEven = new PrintOddEven();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printOddEven.printOdd();
            }
        }, "Thread 1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printOddEven.printEven();
            }
        }, "Thread 2");
        t1.start();
        t2.start();
    }
}
