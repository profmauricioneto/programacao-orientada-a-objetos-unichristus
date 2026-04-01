package org.unichristus.unidade2.abstractclass.observer_exemplo;

public class Main {
    public static void main(String[] args) {
        Subject sub = new Subject();
        ObserverSenderEmail ob1 = new ObserverSenderEmail(sub);
        ob1.addEmail("joao@email.com");
        ob1.addEmail("fulano@email.com");
        ob1.addEmail("cicrano@email.com");
        ob1.addEmail("beltrano@email.com");

        for (int i = 0; i < 5; i++) {
            if (sub.isEven(i)) {
                sub.notifyAllAttached();
            }
        }
    }
}
