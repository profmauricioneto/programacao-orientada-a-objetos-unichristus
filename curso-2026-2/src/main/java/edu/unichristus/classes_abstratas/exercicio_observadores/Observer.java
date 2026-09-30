package edu.unichristus.classes_abstratas.exercicio_observadores;

public abstract class Observer {
    protected Subject subject;
    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
