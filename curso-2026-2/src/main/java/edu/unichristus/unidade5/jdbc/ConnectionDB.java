package edu.unichristus.unidade5.jdbc;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDB {

    Dotenv env = Dotenv.load();

    private final String url = env.get("URL_CONNECTION");
    private final String login = env.get("USERNAME");
    private final String password = env.get("PASSWORD");

    private Connection conn;
    private static ConnectionDB connectionDB;

    private ConnectionDB() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(url, login, password);
            System.out.println("Conexão com o Banco - Sucesso!");
        } catch(ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }

    private static ConnectionDB getInstanceDB() throws SQLException {
        if (connectionDB == null){
            connectionDB = new ConnectionDB();
        }
        return connectionDB;
    }


    public static void main(String[] args) {
        ConnectionDB connection;
        try {
            connection = ConnectionDB.getInstanceDB();
            System.out.println("Conexão com o Banco de Dados Funcionando.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
