package com.biblioteca.dao;

import java.sql.*;


public class LivroDAO {
    // private Connection conexao;
    
    // public LivroDAO(Connection conexao) {
    //     this.conexao = conexao;
    // }
    
    public void inserirLivro(String titulo, String autor, int ano, String isbn) {
            String sql = "INSERT INTO livro (titulo, autor, ano_publicacao, isbn) VALUES (?, ?, ?, ?)";
        
            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca", "postgres", "20042003");PreparedStatement stmt = conn.prepareStatement(sql)) {
        
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setInt(3, ano);
                stmt.setString(4, isbn);
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
