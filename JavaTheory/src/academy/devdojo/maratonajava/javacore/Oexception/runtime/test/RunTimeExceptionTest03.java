package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
        openConnection2();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing data on the arquive");
            return "Conection Opened";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resource");
        }
        return null;
    }

    private static void openConnection2() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing data on the arquive");
        } finally {
            System.out.println("Closing resource");
        }
    }
}
