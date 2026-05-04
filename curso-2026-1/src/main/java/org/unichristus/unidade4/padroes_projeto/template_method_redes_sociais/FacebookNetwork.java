package org.unichristus.unidade4.padroes_projeto.template_method_redes_sociais;

public class FacebookNetwork extends SocialNetwork {
    public FacebookNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected boolean login(String username, String password) {
        System.out.println("Acessando o Facebook.");
        System.out.println("Nome: " + username);
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\nLogin Realizado com Sucesso.");
        return true;
    }

    @Override
    protected boolean sendData(byte[] data) {
        System.out.println("Mensagem: " + new String(data) + " enviada com sucesso");
        return true;
    }

    @Override
    protected void logout() {
        System.out.println("Logout realizado com sucesso.");
    }
}