package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZAinnerclass.test;



public class InnerClassTest01 {
    private String name = "Eduardo";

    public class InnerClass{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(InnerClassTest01.this.toString());
        }

    }

    public static void main(String[] args) {
        InnerClassTest01 innerClassTest01 = new InnerClassTest01();
        InnerClass innerClass = innerClassTest01.new InnerClass();
        InnerClass innerClass1 = new InnerClassTest01().new InnerClass();
        innerClass.printOuterClassAttribute();
        innerClass1.printOuterClassAttribute();

    }
}
