package Sample;

import java.io.*;

public class SingletonPatternBreakDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance1 = Singleton.instance;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
        objectOutputStream.writeObject(instance1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.txt"));
        Singleton instance2 = (Singleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Hashcode for instance1: "+instance1.hashCode());
        System.out.println("Hashcode for instance2: "+instance2.hashCode());
    }
}
