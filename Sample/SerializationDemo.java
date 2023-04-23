package Sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            SampleClass sampleClass = new SampleClass("Susmit", 27);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Sample.txt"));
            objectOutputStream.writeObject(sampleClass);
            objectOutputStream.close();
            System.out.println("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
