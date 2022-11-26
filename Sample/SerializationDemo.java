package Sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            SampleClass sampleClass = new SampleClass("Susmit", 27);
            FileOutputStream fileOutputStream = new FileOutputStream("Sample.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sampleClass);
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
