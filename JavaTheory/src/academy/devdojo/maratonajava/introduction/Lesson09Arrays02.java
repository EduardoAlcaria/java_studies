package academy.devdojo.maratonajava.introduction;

public class Lesson09Arrays02 {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[0] = "gojo";
        names[1] = "aizen";
        names[2] = "itadori";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        names = new String[4];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
