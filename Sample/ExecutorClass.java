package Sample;

import java.util.concurrent.Callable;

public class ExecutorClass implements Callable{
    private String message;

    public ExecutorClass(String message) {
        this.message = message;
    }

    @Override
    public Object call() throws Exception {
        return "Hi This message is called: "+message;
    }
}
