package Sample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Sample.txt"));
            SampleClass sampleClass = (SampleClass) objectInputStream.readObject();
            System.out.println(sampleClass.toString());
            objectInputStream.close();
            Integer.parseInt(sampleClass.getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
