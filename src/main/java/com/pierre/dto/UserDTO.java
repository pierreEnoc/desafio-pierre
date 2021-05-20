package com.pierre.dto;

import com.pierre.entities.User;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    @NotEmpty(message = "Preenchimento obrigatorio")
    @Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres")
    private String nome;
    @DateTimeFormat(pattern = " dd/MM/YYYY")
    private String dataNascimento;
    private String cep;
    private String document;

    public UserDTO() {

    }

    public UserDTO(User obj) {
        id = obj.getId();
        nome = obj.getNome();
        dataNascimento = obj.getDataNascimento();
        cep = obj.getCep();
        document = obj.getDocument();
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
        this.dataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
