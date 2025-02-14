package com.biblioteca.entity;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private String isbn;
    private boolean emprestado;

    public Livro() {}

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return ano_publicacao;
    }

    public void setAnoPublicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano_publicacao=" + ano_publicacao +
                ", isbn='" + isbn + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}