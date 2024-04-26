public class PrintOddEvenTest {
    int counter = 1;

    static int n;

    void printOdd() throws InterruptedException {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 == 0) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+" printed "+counter);
                counter++;
                notify();
            }
        }
    }

    void printEven() throws InterruptedException {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 != 0) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+" printed "+counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintOddEvenTest printOddEvenTest = new PrintOddEvenTest();
        n = 10;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printOddEvenTest.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printOddEvenTest.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.setName("Odd Thread");
        t2.setName("Even Thread");
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }

}
