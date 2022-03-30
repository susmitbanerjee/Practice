package Thread;

public class ThreadLambda {
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Child thread");
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for(int j=0;j<5;j++){
                System.out.println("Main thread");
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
