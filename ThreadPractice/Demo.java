class Demo1 extends Thread{
    SharedClass sharedClass;

    Demo1(SharedClass sharedClass){
        this.sharedClass=sharedClass;
    }

    public void run(){
        for(int i=0;i<5;i++){
            sharedClass.print();
        }
    }

}
class Demo2 extends Thread{
    SharedClass sharedClass;

    Demo2(SharedClass sharedClass){
        this.sharedClass=sharedClass;
    }

    public void run(){
        for(int i=0;i<5;i++){
            sharedClass.print();
        }
    }

}
class SharedClass{
    int x;
    public void print(){
        System.out.println(Thread.currentThread().getName()+" printed : "+x);
        x++;
    }
}
public class Demo{
    public static void main(String[] args) throws InterruptedException {
        int x=0;
        SharedClass sharedClass = new SharedClass();
        sharedClass.x=0;

        Demo1 d1 = new Demo1(sharedClass);
        Demo2 d2 = new Demo2(sharedClass);

        d1.start();
        Thread.sleep(1000);
        d2.start();

    }
}
