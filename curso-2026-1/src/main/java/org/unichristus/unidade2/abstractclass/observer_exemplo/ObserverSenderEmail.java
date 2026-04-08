package org.unichristus.unidade2.abstractclass.observer_exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ObserverSenderEmail extends Observer {
    private List<String> listaEmails;

    public ObserverSenderEmail(Subject subject) {
        subject.attach(this);
        listaEmails = new ArrayList<>();
    }

    public void mostrarEmails() {
        listaEmails.forEach(emails -> System.out.println(emails));
    }

    public void addEmail(String email) {
        listaEmails.add(email);
    }

    @Override
    public void update() {
        System.out.println("Opa! Um novo aviso chegou...enviando para: ");
        mostrarEmails();
    }
}
