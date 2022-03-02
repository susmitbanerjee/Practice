package Fundamentals;

class Parent{
    ParentClass sum(int a,int b){
        return new ParentClass();
    }
}
public class MethodOverriding extends Parent{
    ParentChild sum(int a, int b){
        return new ParentChild();
    }
    void print(){
        System.out.println("This is test");
    }

    public static void main(String[] args) {
        Parent methodOverriding = new MethodOverriding();
        //methodOverriding.print(); Can't be accessed

    }
}
