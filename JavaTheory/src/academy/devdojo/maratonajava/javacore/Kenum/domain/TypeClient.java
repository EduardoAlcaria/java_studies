package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    STUDENT(1, "STUDENT"),
    PROFESSOR(2, "PROFESSOR");

    private final int VALUE;
    private final String nameLog;

    TypeClient(int value, String nameLog) {
        this.VALUE = value;
        this.nameLog = nameLog;
    }

    public int getValue() {
        return VALUE;
    }

    public String getNameLog() {
        return nameLog;
    }
}
