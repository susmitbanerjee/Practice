package Sample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Sample.ExecutorClass executorClass = new Sample.ExecutorClass("WHATSAPP");

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Future<String> result = executorService.submit(executorClass);

        System.out.println("Message is: "+ result.get());
    }
}
