package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class People {
    private String name;
    private int age;

    public void print(){
        System.out.println(name);
        System.out.println(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0){
            System.out.println("invalid age");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}