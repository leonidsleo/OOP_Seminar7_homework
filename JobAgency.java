package OOPseminar7homework;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, Vacansy vacansy) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary, vacansy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}