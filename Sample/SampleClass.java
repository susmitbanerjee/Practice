package Sample;

public class SampleClass implements Cloneable{
    protected String name;
    protected int age;

    public SampleClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SampleClass(){
        this.name="Not Provided defualt constructor";
        this.age=25;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public SampleClass clone() {
        try {
            SampleClass clone = (SampleClass) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
