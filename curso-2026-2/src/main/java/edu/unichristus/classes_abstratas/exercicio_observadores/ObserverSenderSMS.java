package edu.unichristus.classes_abstratas.exercicio_observadores;

import java.util.ArrayList;
import java.util.List;


public class ObserverSenderSMS extends Observer {
    private List<String> phones;
    public ObserverSenderSMS(Subject subject) {
        super(subject);
        this.phones = new ArrayList<>();
    }

    public void addNumberPhone(String numberPhone) {
        if (numberPhone.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("Número inválido!");
        } else {
            phones.add(numberPhone);
        }
    }

    public void removeNumberPhone(String numberPhone) {
        boolean found = false;
        for (String e : phones) {
            if (e.equalsIgnoreCase(numberPhone)) {
                phones.remove(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Não foi possível remover o Número de Telefone.\nNúmero não encontrado!");
        }
    }

    public String getNumberPhones() {
        //return String.join(", ", emails);
        return phones.toString();
    }

    @Override
    public void update() {
        System.out.println("Enviando SMS para: ");
        System.out.println(getNumberPhones());
    }

}
