package Sample;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> blockingQueue;
    int taken=0;
    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(taken!=4){
            try {
                taken = blockingQueue.take();
                System.out.println("Cosumer consumed from BQ is : "+taken);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
