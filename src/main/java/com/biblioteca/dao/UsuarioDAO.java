package com.biblioteca.dao;

import java.sql.*;

import com.biblioteca.Conexao;


public class UsuarioDAO {


    public void inserirUsuario(String nome, String cpf, String email) {
        String sql = "INSERT INTO usuario (nome, cpf, email) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.conectar();PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, email);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Usuário inserido com sucesso!");
            } else {
                System.out.println("Nenhum usuário foi inserido.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
