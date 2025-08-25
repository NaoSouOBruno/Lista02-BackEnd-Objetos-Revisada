package org.example;

import java.sql.SQLOutput;

public class Senha {
    // setando variaveis
    private String senha = "senhaPadrao";

    // construtor
    Senha(String senha) {
        this.senha = senha;
    }

    // metodo de output
    void exibirSenha() {
        System.out.println("A senha gerada é: " + senha);
    }

    // getter
    String getSenha() {
        return this.senha;
    }

    // setter
    void setSenha(String senha) {
        this.senha = senha;
    }

}
