package Sample;

import java.io.Serializable;

public class Singleton implements Serializable {

    public static Singleton instance = new Singleton();

    private Singleton(){

    }

    private static Singleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
