package academy.devdojo.maratonajava.goingover.domain;

public class Even {
    private int range;
    private int[] pass;
    private int howManyEven;

    public Even(int range) {
        this.range = range;
        for (int i = 0; i < range; i++) {
            if (i % 2 == 0) {
                howManyEven++;
            }
        }
        pass = new int[howManyEven];
    }

    public void verify() {
        int index = 0;
        for (int i = 0; i < range; i++) {
            if (i % 2 == 0) {
                pass[index] = i;
                index++;
            }
        }
    }
    public void print(){
        verify();
        for (int num : pass) {
            System.out.println(num);
        }

    }
}
