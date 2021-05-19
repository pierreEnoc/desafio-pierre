package com.pierre;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String DataNascimento;
    private String cep;
    private String Document;

    public User() {

    }

    public User(Integer id, String nome, String dataNascimento, String cep, String document) {
        this.id = id;
        this.nome = nome;
        DataNascimento = dataNascimento;
        this.cep = cep;
        Document = document;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", cep='" + cep + '\'' +
                ", Document='" + Document + '\'' +
                '}';
    }
}
