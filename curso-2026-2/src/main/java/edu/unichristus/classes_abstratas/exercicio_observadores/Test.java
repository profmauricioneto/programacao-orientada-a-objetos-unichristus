package edu.unichristus.classes_abstratas.exercicio_observadores;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ObserverSenderEmail obEmails = new ObserverSenderEmail(subject);
        obEmails.addEmail("joaozinho@email.com");
        obEmails.addEmail("mariazinha@email.com");
        obEmails.addEmail("fulaninho@email.com");

        ObserverSenderSMS obSMS = new ObserverSenderSMS(subject);
        obSMS.addNumberPhone("85 11223344");
        obSMS.addNumberPhone("85 44332211");
        obSMS.addNumberPhone("85 55667788");

        subject.attach(obEmails);
        subject.attach(obSMS);

        for (int i = 0; i < 5; i++) {
            if (subject.isEvent(i)) {
                subject.notifyAllAttach();
            }
        }
    }
}
