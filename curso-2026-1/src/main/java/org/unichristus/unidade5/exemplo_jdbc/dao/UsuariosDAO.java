package org.unichristus.unidade5.exemplo_jdbc.dao;

import org.unichristus.unidade5.exemplo_jdbc.ConnectionDB;
import org.unichristus.unidade5.exemplo_jdbc.entitites.Usuarios;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {
    private Connection connection;
    public UsuariosDAO() throws SQLException {
        try {
            this.connection  = ConnectionDB.getInstance().getConnection();
        } catch (Exception e) {
            throw new SQLException(e);
        }
    }

    public void adicionarUsuario(Usuarios usuario) {
        String query = "INSERT INTO usuarios(nome, email, cpf, data) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement state = connection.prepareStatement(query);
            state.setString(1, usuario.getNome());
            state.setString(2, usuario.getEmail());
            state.setString(3, usuario.getCpf());
            state.setDate(4, new Date(usuario.getData().getTimeInMillis()));
            int effectRows = state.executeUpdate();
            state.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void mostrarUsuarios() {
        String query = "SELECT * FROM usuarios;";
        try {
            PreparedStatement state = connection.prepareStatement(query);
            ResultSet rs = state.executeQuery();
            List<Usuarios> usuarios = new ArrayList<>();
            while(rs.next()) {
                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("NOME : " + rs.getInt("nome"));
                System.out.println("EMAIL : " + rs.getInt("email"));
                System.out.println("CPF : " + rs.getInt("cpf"));
                System.out.println("DATA : " + rs.getInt("data"));
            }
            rs.close();
            state.close();
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deletarUsuario(int id) {
        String query = "DELETE FROM usuarios WHERE id = ?;";
        try {
            PreparedStatement state = connection.prepareStatement(query);
            state.setInt(1, id);
            int effectedRows = state.executeUpdate();
            if (effectedRows == 0) {
                System.out.println("Nenhuma tupla foi apagada do banco!");
            }
            state.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateUsuario(int id, Usuarios usuario) {
        String query = "UPDATE usuarios SET nome = ?, email = ?, cpf = ?, data = ? WHERE id = ?;";
        try {
            PreparedStatement state = connection.prepareStatement(query);
            state.setString(1, usuario.getNome());
            state.setString(2, usuario.getEmail());
            state.setString(3, usuario.getCpf());
            state.setDate(4, new Date(usuario.getData().getTimeInMillis()));
            state.setInt(5, id);
            int effectedRow = state.executeUpdate();
            if (effectedRow == 0) {
                System.out.println("Nenhuma tupla foi atualizada nesta execução!");
            }
            state.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
