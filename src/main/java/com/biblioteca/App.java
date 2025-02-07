package com.biblioteca;



import java.sql.*;

import com.biblioteca.dao.LivroDAO;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/biblioteca";
        String usuario = "postgres";
        String senha = "20042003";
        System.out.println("teste");
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            if (conexao != null) {
                System.out.println("Banco de Dados conectado com sucesso!");

                Statement stm = conexao.createStatement();

                LivroDAO livroDAO = new LivroDAO();
                livroDAO.inserirLivro("Dom Casmurro","Machado de Assis",1987, "2222-222");

            } else {
                System.out.println("Banco de Dados não conectado!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
