package Fundamentals;
class ParentClass{
    void print(){
        System.out.println("This is parent class");
    }
}
public class ParentChild extends ParentClass{
    void print(){
        System.out.println("This is child class");
    }
}
