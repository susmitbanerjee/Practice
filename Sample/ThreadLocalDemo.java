package Sample;

public class ThreadLocalDemo {
    public static class ThreadLocalClass implements Runnable{
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        @Override
        public void run() {
            threadLocal.set((int) (Math.random()*50D));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" printed : "+threadLocal.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalClass threadLocalClass = new ThreadLocalClass();

        Thread t1 = new Thread(threadLocalClass);
        Thread t2 = new Thread(threadLocalClass);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
