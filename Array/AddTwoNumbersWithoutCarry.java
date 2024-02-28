package Array;

public class AddTwoNumbersWithoutCarry {
    public static void addTwoNumbersWithoutCarry(int num1, int num2){
        int sum = 0;
        int multiplier=1;

        while(num1>0 && num2>0){
            int digit1 = num1%10;
            int digit2 = num2%10;

            sum+=((digit1+digit2)%10)*multiplier;

            num1 = num1/10;
            num2 = num2/10;
            multiplier*=10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        addTwoNumbersWithoutCarry(123, 459);
    }
}
