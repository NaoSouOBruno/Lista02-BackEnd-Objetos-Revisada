package org.example;

public class Jogador {
    private String nome = "nomePadrao";
    private String sobrenome = "sobrenomePadrao";
    private String posicao = "posicaoPadrao";
    private String time = "timePadrao";
    private int idade = 0;

    Jogador(String nome, String sobrenome, String posicao, String time, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.time = time;
        this.idade = idade;
    }

    void exibirInformacoes() {
        System.out.println(nome + " " + sobrenome + " é um " + posicao + " que atua no " + time + " aos seus " + idade + " anos de idade.");
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getSobrenome() {
        return this.sobrenome;
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    void setIdade(int idade) {
        if (idade >= 16) {
            this.idade = idade;
        }
    }
}
