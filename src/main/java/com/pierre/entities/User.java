package com.pierre.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Document
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private String dataNascimento;

    private String endereco;
    private String document;

    public User() {

    }

    public User(String id, String nome, String dataNascimento, String endereco, String document) {
        this.id = id;
        this.nome = nome;
        dataNascimento = dataNascimento;
        this.endereco = endereco;
        document = document;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        dataNascimento = dataNascimento;
    }

    public String getCep() {
        return endereco;
    }

    public void setCep(String cep) {
        this.endereco = cep;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        document = document;
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
                ", DataNascimento='" + dataNascimento + '\'' +
                ", cep='" + endereco + '\'' +
                ", Document='" + document + '\'' +
                '}';
    }
}
