package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZAinnerclass.test;

public class InnerClassTest02 {
    private final String name = "Eduardo";

    void print(){
        final String lastName = "Alcaria";
        final class LocalClass {
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        InnerClassTest02 innerClassTest02 = new InnerClassTest02();

        innerClassTest02.print();
    }
}
