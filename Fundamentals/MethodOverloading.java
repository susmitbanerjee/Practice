package Fundamentals;

public class MethodOverloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int b, int c, int d) {
        return b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 5));
        System.out.println(sum(10, 5, 5));
    }
}