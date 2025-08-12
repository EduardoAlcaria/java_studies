package JavaTheory.src.academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concat(1_000_000);
        long end = System.currentTimeMillis();

        System.out.println("time for the concat String " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();

        System.out.println("time for the concat StringBuilder " + (end - begin) + "ms");

begin = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();

        System.out.println("time for the concat StringBuffer " + (end - begin) + "ms");

    }

    private static void concatStringBuilder(int size){
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }

    }
    private static void concat(int size){
        String txt = "";
        for (int i = 0; i < size; i++) {
            txt += i;
        }

    }
    private static void concatStringBuffer(int size){
        StringBuffer buffer = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            buffer.append(i);
        }

    }
}
