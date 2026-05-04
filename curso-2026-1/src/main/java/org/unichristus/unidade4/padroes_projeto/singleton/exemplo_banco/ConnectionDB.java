package org.unichristus.unidade4.padroes_projeto.singleton.exemplo_banco;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    // instancia para carregar o .env
    private Dotenv env = Dotenv.load();

    private String username;
    private String password;
    private final String urlConnection = env.get("DB_URL");

    private Connection connection;
    private static ConnectionDB instance; // instancia da classe!

    private ConnectionDB() throws SQLException {
        this.username = env.get("DB_USERNAME");
        this.password = env.get("DB_PASSWORD");
        try {
            this.connection = DriverManager.getConnection(urlConnection, username, password);
            System.out.println("Conexão estabelecida com o banco!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco!", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectionDB getInstance() {
        try {
            if (instance == null) {
                instance = new ConnectionDB();
            }
        } catch (Exception e) {
            System.err.println("Erro na instance da classe.");
            System.err.println(e.getMessage());
        } finally {
            return instance;
        }
    }
}
