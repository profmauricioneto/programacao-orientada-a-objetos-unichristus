package org.unichristus.unidade2.abstractclass.observer_exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject {
    public List<Observer> observadores;

    public Subject() {
        this.observadores = new ArrayList<>();
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) return true;
        return false;
    }

    public void attach(Observer observer) {
        observadores.add(observer);
    }

    public void detach(Observer observer) {
        observadores.remove(observer);
    }

    public void notifyAllAttached() {
        System.out.println("Avisando aos observadores");
        observadores.forEach(ob -> ob.update());
    }
}
