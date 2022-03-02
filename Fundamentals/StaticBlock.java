package Fundamentals;

public class StaticBlock {
    private StaticBlock(){
        System.out.println("Constructor initialized");
    }
    static {
        System.out.println("Static block initialized");
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
    }
}
