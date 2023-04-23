package Sample;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=1;i<=4;i++){
            try {
                blockingQueue.put(i);
                System.out.println("The Produced item in BQ is: "+blockingQueue);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
