package edu.unichristus.classes_abstratas.exercicio_observadores;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    public Subject(){
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Observador Nulo");
        } else {
            observers.add(observer);
        }
    }

    public void dettach(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Observador Nulo");
        } else {
            observers.remove(observer);
        }
    }

    public boolean isEvent(int event) {
        if (event % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void notifyAllAttach() {
        System.out.println("Notificando os Inscritos!");
        for (Observer ob: observers) {
            ob.update();
        }
    }
}
