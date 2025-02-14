package com.biblioteca.dao;

import java.sql.*;

import com.biblioteca.Conexao;


public class LivroDAO {

    public void inserirLivro(String titulo, String autor, int ano_publicacao, String isbn, boolean emprestado) {
            String sql = "INSERT INTO livro (titulo, autor, ano_publicacao, isbn, emprestado) VALUES (?, ?, ?, ?)";
        
            try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
        
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setInt(3, ano_publicacao);
                stmt.setString(4, isbn);
                stmt.setBoolean(5, emprestado);
                int linhasAfetadas = stmt.executeUpdate();
                if (linhasAfetadas > 0) {
                    System.out.println("Livro inserido com sucesso!");
                } else {
                    System.out.println("Nenhum livro foi inserido.");
                }
        
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
}
