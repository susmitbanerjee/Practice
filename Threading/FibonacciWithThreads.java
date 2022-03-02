package Threading;

import sun.awt.windows.ThemeReader;

public class FibonacciWithThreads {
    int a=0,b=1,c=0;
    int counter=1;
    static int n;

    public void printFirst(){
        synchronized (this){
            while(counter<n){
                if(counter%2==0){
                    try {
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                c=a+b;
                System.out.println(Thread.currentThread().getName()+" "+c);
                a=b;
                b=c;
                counter++;
                notify();
            }
        }
    }
    public void printSecond(){
        synchronized (this){
            while(counter<n){
                if(counter%2!=0){
                    try {
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                c=a+b;
                System.out.println(Thread.currentThread().getName()+" "+c);
                a=b;
                b=c;
                counter++;
                notify();
            }
        }

    }

    public static void main(String[] args) {
        n=10;
        FibonacciWithThreads fibo = new FibonacciWithThreads();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fibo.printFirst();
            }
        },"Thread 1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fibo.printSecond();
            }
        },"Thread 2");
        t1.start();
        t2.start();
    }

}
