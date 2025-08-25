package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio02();
    }

    static void exercicio01() {
        String[] caracteres = {"A", "B", "C", "D", "E", "1", "2", "3", "4", "5"};

        for (int i=0; i<10; i++){
            List<String> senhaList = new ArrayList<>();

            for (int j = 0; j < 8; j++) {
                Random r = new Random();
                int idxAleatorio = r.nextInt(caracteres.length);
                String caracter = caracteres[idxAleatorio];
                senhaList.add(caracter);
            }

            String senha = String.join("", senhaList);
            Senha senhaGerada = new Senha(senha);
            senhaGerada.exibirSenha();
        }
    }

    static void exercicio02() {
        String[] nomes = {"Bruno", "Gabi", "Bell", "Wilson", "Brayan"};
        String[] sobrenomes = {"Carlos", "Almeida", "Neto"};
        String[] posicoes = {"Zagueiro", "Volante", "Goleiro", "Atacante"};
        String[] times = {"Flamengo", "Vasco", "Grêmio", "Internacional"};

        Random r = new Random();

        for (int i=0; i<11; i++) {
            int idxAleatorioNomes = r.nextInt(nomes.length);
            int idxAleatorioSobrenomes = r.nextInt(sobrenomes.length);
            int idxAleatorioPosicoes = r.nextInt(posicoes.length);
            int idxAleatorioTimes = r.nextInt(times.length);
            int idade = r.nextInt(50 - 18) + 18;

            Jogador jogadorGerado = new Jogador(
                    nomes[idxAleatorioNomes],
                    sobrenomes[idxAleatorioSobrenomes],
                    posicoes[idxAleatorioPosicoes],
                    times[idxAleatorioTimes],
                    idade
            );

            jogadorGerado.exibirInformacoes();
        }
    }

    static void exercicio03() {
        String[] nomesPokemon = {"Empoleon", "Arcanine", "Mewtwo", "Reshiram", "Electivire"};
        String[] tiposPokemon = {"Água", "Fogo", "Psíquico", "Dragão", "Elétrico"};

        Random r = new Random();

        for (int i=0; i<6; i++) {
            int idxNomePokemonAleatorio = r.nextInt(nomesPokemon.length);
            int idxTiposPokemonAleatorio = r.nextInt(tiposPokemon.length);
            int nivel = r.nextInt(100 - 1) + 1;

            Pokemon pokemonGerado = new Pokemon(
                    nomesPokemon[idxNomePokemonAleatorio],
                    tiposPokemon[idxTiposPokemonAleatorio],
                    nivel
            );

            pokemonGerado.exibirInformacoes();
        }
    }
}