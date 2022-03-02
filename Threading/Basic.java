package Threading;

class MyThread extends Thread{
    SharedClass sharedClass;
    MyThread(SharedClass sharedClass){
        this.sharedClass=sharedClass;
    }
    public void run(){
        for(int i=0;i<5;i++){
            sharedClass.print();
            System.out.println("MyThread print it");
        }
    }
}
class MyThread2 extends Thread{
    SharedClass sharedClass;
    MyThread2(SharedClass sharedClass){
        this.sharedClass=sharedClass;
    }
    public void run(){
        for(int i=0;i<5;i++){
            sharedClass.print();
            System.out.println("MyThread2 print it");
        }
    }
}
class SharedClass{
    int x;
    SharedClass(int x){
        this.x=x;
    }
     void print(){
        System.out.println(x);
        x++;
    }
}
public class Basic {
    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        SharedClass sharedClass = new SharedClass(x);
        MyThread t1 = new MyThread(sharedClass);
        MyThread2 t2 = new MyThread2(sharedClass);
        t1.start();
        Thread.sleep(100);
        t2.start();
    }
}
