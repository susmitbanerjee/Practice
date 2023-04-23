package Fundamentals;
class ParentClass{
    void print(){
        System.out.println("This is parent class");
    }
}
public class ParentChild extends ParentClass{
    @Override
    void print(){
        System.out.println("This is child class");
    }
    void printAlone(){
        System.out.println("Alone");
    }

    public static void main(String[] args) {
        ParentClass pr=new ParentChild();
        ParentClass pr1=new ParentClass();
        ParentChild pr2=new ParentChild();
        pr1.print();
        pr.print();
        pr2.print();
        pr2.printAlone();
    }
}
