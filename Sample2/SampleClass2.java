package Sample2;

import Sample.SampleClass;

public class SampleClass2 extends SampleClass{
    String name;
    SampleClass2(){
        this.name=super.name;
    }
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass("Java", 20);
        SampleClass2 sampleClass2 = new SampleClass2();
        System.out.println(sampleClass2.name);
    }
}
