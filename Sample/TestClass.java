package Sample;

import java.lang.reflect.Constructor;

public class TestClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SampleClass sampleClass = new SampleClass("Java", 20);
        SampleClass sampleClass1= new SampleClass();
        //SampleClass sampleClass2 = SampleClass.class.newInstance();
        //Constructor[]  sampleClassConstructors =  SampleClass.class.getConstructors();
        //System.out.println(sampleClassConstructors[1].toString());
        //System.out.println(sampleClass2.toString());
        //System.out.println(sampleClass1.toString());
        //System.out.println(sampleClass.toString());
        //SampleClass cloneObject = sampleClass.clone();
        //System.out.println(cloneObject.toString());
        System.out.println(sampleClass.name+" "+sampleClass.age);
    }
}
