package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double topSpeed;
    private static double speedLimit = 250;

    public Car(String name, double topSpeed){
        this.name = name;
        this.topSpeed = topSpeed;
    }
    public void print(){
        System.out.println("-----------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Top Speed: " + this.topSpeed);
        System.out.println("Speed Limit:' " + Car.speedLimit);
    }
    public static void setSpeedLimit(double speedLimit){
        Car.speedLimit = speedLimit;
    }
}