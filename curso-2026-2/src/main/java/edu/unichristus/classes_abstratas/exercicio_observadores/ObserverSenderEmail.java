package edu.unichristus.classes_abstratas.exercicio_observadores;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderEmail extends Observer {
    private List<String> emails;

    public ObserverSenderEmail(Subject subject) {
        super(subject);
        this.emails = new ArrayList<>();
    }

    public void addEmail(String email) {
        if (email.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Email inválido!");
        } else {
            emails.add(email);
        }
    }

    public void removeEmail(String email) {
        boolean found = false;
        for (String e : emails) {
            if (e.equalsIgnoreCase(email)) {
                emails.remove(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Não foi possível remover o e-mail.\nEmail não encontrado!");
        }
    }

    public String getEmails() {
        //return String.join(", ", emails);
        return emails.toString();
    }

    @Override
    public void update() {
        System.out.println("Enviando Emails para: ");
        System.out.println(getEmails());
    }

}
