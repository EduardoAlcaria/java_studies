package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {

        divide(10, 0);

        System.out.println("After the exception");
    }

    private static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return a/b;
    }
}
