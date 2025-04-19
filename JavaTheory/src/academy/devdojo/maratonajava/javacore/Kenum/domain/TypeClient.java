package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    STUDENT(1, "Student"),
    TEACHER(2, "Professor");


    private final int index;
    private final String nameLog;

    TypeClient(int index, String nameLog) {
        this.nameLog = nameLog;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static TypeClient typeClientNameLog(String nameLog){
        for (TypeClient typeClient : values()) {
            if(typeClient.getNameLog().equals(nameLog)){
                return typeClient;
            }
        }
        return null;
    }

    public String getNameLog() {
        return nameLog;
    }
}
