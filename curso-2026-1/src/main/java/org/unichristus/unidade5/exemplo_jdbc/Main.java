package org.unichristus.unidade5.exemplo_jdbc;

import org.unichristus.unidade5.exemplo_jdbc.dao.UsuariosDAO;
import org.unichristus.unidade5.exemplo_jdbc.entitites.Usuarios;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    private Scanner scan;
    private UsuariosDAO dao;
    public Main() throws SQLException {
        scan = new Scanner(System.in);
        dao = new UsuariosDAO();
    }

    public void adicionarUsuario() {
        Usuarios usuario = new Usuarios();
        System.out.println("Digite o nome do usuário: ");
        String nome = scan.next();
        usuario.setNome(nome);

        System.out.println("Digite o email do usuário: ");
        String email = scan.next();
        usuario.setEmail(email);

        System.out.println("Digite o CPF do usuário: ");
        String cpf = scan.next();
        usuario.setCpf(cpf);

        Calendar data = Calendar.getInstance();
        usuario.setData(data);
        dao.adicionarUsuario(usuario);
    }

    public void mostrarUsuarios() {
        dao.mostrarUsuarios();
    }

    public void iniciar() throws SQLException {
        Main entrada = new Main();
        System.out.println("CRUD usando JDBC e DAO");
        int op = 0;
        do {
            System.out.println("Escolha as opções:]\n1 - Add Usuario\n2 - Mostrar Usuarios\n3 - Sair\nOpcao: ");
            op = scan.nextInt();
            switch (op) {
                case 1: {
                    entrada.adicionarUsuario();
                    System.out.println("Usuario inserido com sucesso!");
                    break;
                }
                case 2: {
                    entrada.mostrarUsuarios();
                    break;
                }
                case 3: {
                    System.out.println("Fim do Programa! Obrigado.");
                    break;
                }
                default: {
                    System.err.println("Nenhum caso válido foi escolhido");
                }
            }
        } while (op != 3);
        System.out.println("Fim do sistema");
    }

    public static void main(String[] args) {
        try {
            Main entrada = new Main();
            entrada.iniciar();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
