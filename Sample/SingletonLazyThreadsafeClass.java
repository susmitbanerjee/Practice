package Sample;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonLazyThreadsafeClass {
    //private static final SingletonLazyThreadsafeClass INSTANCE1 = new SingletonLazyThreadsafeClass();

    private SingletonLazyThreadsafeClass () {
    }

    public static SingletonLazyThreadsafeClass getInstance() {
        //Thread.sleep(1000);
        return Inner.INSTANCE;
    }

    public int division(int i, int j) throws InterruptedException{
        if(Objects.nonNull(j)) {
            return i/j;
        } else {
            throw new NullPointerException();
        }

    }

    static class Inner {
        private static final SingletonLazyThreadsafeClass INSTANCE = new SingletonLazyThreadsafeClass();//Bill plough
    }

    public static void main(String[] args) throws InterruptedException {

        SingletonLazyThreadsafeClass.getInstance().division(1, 2);

		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i=0; i<4; i++) {
			es.submit(()-> {
                System.out.println(SingletonLazyThreadsafeClass.getInstance().hashCode());
            });
		}
	es.shutdown();
    }
}



