package edu.unichristus.unidade4.design_patterns.singleton;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDBSingleton {
    private static final String url = "jdbc:postgresql://localhost:5432/exemplodb";
    private static final String login = "root";
    private static final String password = "root";

    private Connection conn;
    private static ConnectionDBSingleton instance;

    private ConnectionDBSingleton() throws SQLException {
        this.conn = DriverManager.getConnection(url, login, password);
        System.out.println("Conexão realizada com sucesso!");
    }

    private Connection getConnection() {
        return conn;
    }

    public static synchronized ConnectionDBSingleton getInstance() throws SQLException {
        if (instance == null ) {
            System.out.println("Instancia criada com sucesso!");
            instance = new ConnectionDBSingleton();
        }
        return instance;
    }

    public static void main(String[] args) throws SQLException {
        try {
            ConnectionDBSingleton sing1 = ConnectionDBSingleton.getInstance();
            ConnectionDBSingleton sing2 = ConnectionDBSingleton.getInstance();
            if (sing1 == sing2) {
                System.out.println("Instancias Iguais!");
            }

            System.out.println(sing1);
            System.out.println(sing2);
        } catch (SQLException e) {
            throw new SQLException("Erro na conexão.");
        }
    }
}
