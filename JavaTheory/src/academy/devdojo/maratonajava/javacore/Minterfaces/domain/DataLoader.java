package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {

    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Checking permissions");
    }

    static void retrieveMaxDataSize(){
        System.out.println("inside the retrieveMaxDataSize on the interface");
    }

}
