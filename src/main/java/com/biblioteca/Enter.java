package com.biblioteca;
    
import com.biblioteca.dao.UsuarioDAO;
import com.biblioteca.dao.LivroDAO;
import com.biblioteca.entity.Livro;
import com.biblioteca.entity.Emprestimo;
import com.biblioteca.entity.Usuario;
import com.biblioteca.entity.Biblioteca;

import java.sql.*;

public class Enter {
    public static void main(String[] args) {
        Connection conexao = Conexao.conectar();
        
        if (conexao != null) {
            System.out.println("Conexão com o banco realizada com sucesso!");
        }

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.inserirUsuario("Giovana", "105.257.349-00", "giovana.lib@gmail.com");

        // LivroDAO livroDAO = new LivroDAO();
        // livroDAO.inserirLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "894-5-18-148410-0");

        // Continua com o código do menu...
    }
}
