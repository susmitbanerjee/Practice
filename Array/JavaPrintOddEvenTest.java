public class JavaPrintOddEvenTest {
    int count = 10;
    int n = 0;
    void printEven() throws InterruptedException {
        synchronized (this) {
            while (n < count) {
                if (n % 2 != 0) {
                    wait();
                }
                System.out.println("Current Value: " + n+ Thread.currentThread().getName());
                n++;
                notify();
            }
        }
    }
    void printOdd() throws InterruptedException {
        synchronized (this){
        while(n< count) {
            if (n % 2 == 0) {
                wait();
            }
            System.out.println("Current Value: " + n+ Thread.currentThread().getName());
            n++;
            notify();
        }
        }
    }

    public static void main(String[] args) {
        JavaPrintOddEvenTest javaPrintOddEvenTest = new JavaPrintOddEvenTest();

        Thread t1  =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    javaPrintOddEvenTest.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread 1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    javaPrintOddEvenTest.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread 2");
        t1.start();
        t2.start();
    }
}
