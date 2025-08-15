package JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentService<T> {
    private List<T> availableObjs;

    public RentService(List<T> availableObjs) {
        this.availableObjs = availableObjs;
    }

    public T retriveAvaliableObjs(){
        T t = availableObjs.removeFirst();
        System.out.println("Renting objs: " + t);
        System.out.println("available objs");
        System.out.println(availableObjs);
        return t;
    }

    public void returnRentCar(T t){
        System.out.println("Returning: " + t);
        availableObjs.add(t);
        System.out.println("available objs");
        System.out.println(availableObjs);
    }
}
