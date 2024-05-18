package Sample;

import java.io.Serializable;

public class Singleton implements Serializable {

    public static Singleton instance=null;

    private Singleton(){

    }

    private static Singleton getInstance(){
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;

    }

    private Object readResolve(){
        return instance;
    }
}
