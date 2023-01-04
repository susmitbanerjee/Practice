package Sample;

public class EnumDemo {

    enum Developer{
        BACKEND,
        FRONTEND
    }

    public static void main(String[] args) {
        Developer developer = Developer.BACKEND;
        System.out.println(developer);

    }
}
