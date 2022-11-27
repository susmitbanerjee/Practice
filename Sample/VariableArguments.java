package Sample;

public class VariableArguments {
    void printVariable(int b, String... values){
        System.out.println(b);
        for(String str: values){
            System.out.println(str.toString());
        }
    }

    public static void main(String[] args) {
        VariableArguments variableArguments = new VariableArguments();
        variableArguments.printVariable(1,"Hello", "World");
        variableArguments.printVariable(2,"Hello","my", "World");
    }
}
