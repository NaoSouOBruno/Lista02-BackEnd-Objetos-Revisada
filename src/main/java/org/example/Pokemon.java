package org.example;

public class Pokemon {
    private String nome = "nomePadrao";
    private String tipo = "tipoPadrao";
    private int nivel = 0;

    Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    void exibirInformacoes() {
        System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
}
