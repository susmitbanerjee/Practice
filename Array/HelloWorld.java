import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("Enter the choice you want?");
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(String.valueOf(sc.nextInt()));
        if(op==1){
            System.out.println(a+b);
        }else{
            System.out.println("your choice was diff");
        }

    }
}
