package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZAinnerclass.test;

public class InnerClassTest03 {
    private String name = "Eduardo";
    static class Nested {
        void print(){
            System.out.println(new InnerClassTest03().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
