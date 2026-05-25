package org.unichristus.unidade5.exemplo_jdbc;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    // carregando variáveis de ambiente
    private Dotenv env = Dotenv.load();

    // atributos
    private String username;
    private String password;
    private final String urlConnection = env.get("URL_CONNECTION");
    private Connection connection;

    // instancia da classe (singleton)
    private static ConnectionDB instance;

    public ConnectionDB() throws SQLException {
        this.username = env.get("USERNAME");
        this.password = env.get("PASSWORD");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(urlConnection, username, password);
            System.out.println("Conexão com o banco de dados estabelecida!");
        } catch (ClassNotFoundException e) {
            System.err.println("Error ao se conectar com o banco.");
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectionDB getInstance() {
        try {
            if (instance == null) instance = new ConnectionDB();
        } catch (Exception e) {
            System.err.println("Erro na instance da classe.");
            System.err.println(e.getMessage());
        } finally {
            return instance;
        }
    }

    public static void main(String[] args) {
        try {
            ConnectionDB conn = ConnectionDB.getInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
