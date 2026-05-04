package org.unichristus.unidade4.padroes_projeto.template_method_redes_sociais;

public abstract class SocialNetwork {
    protected String username;
    protected String password;

    public SocialNetwork() {}

    // método template
    public boolean postData(String message) {
        boolean result = false;
        if (login(this.username, this.password)) {
            result = sendData(message.getBytes());
            logout();
        }
        return result;
    }

    protected abstract boolean login(String username, String password);
    protected abstract boolean sendData(byte[] data);
    protected abstract void logout();

}
