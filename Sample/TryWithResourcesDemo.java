package Sample;

import java.io.FileOutputStream;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("Sample2.txt")){
            String str="This should be written too";
            byte[] message=str.getBytes("UTF-8");
            fileOutputStream.write(message);
            System.out.println("Written successfully this one too!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
