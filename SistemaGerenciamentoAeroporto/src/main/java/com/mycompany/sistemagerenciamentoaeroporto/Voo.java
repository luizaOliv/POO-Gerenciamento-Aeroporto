package com.mycompany.sistemagerenciamentoaeroporto;

public class Voo {
    private int idVoo;
    private String nomeVoo;
    private int capacidade;
    private String horarioPartida;
    private String horarioChegada;
    private String origem;
    private String destino;
    private double preço;
    private int passagensReservadas;

    public Voo(int idVoo, String nomeVoo, int capacidade, String horarioPartida, String horarioChegada, String origem, String destino, double preço) {
        this.idVoo = idVoo;
        this.nomeVoo = nomeVoo;
        this.capacidade = capacidade;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.origem = origem;
        this.destino = destino;
        this.preço = preço;
        this.passagensReservadas = 0;
    }

    public void DetalhesVoo() {
        System.out.println("----------------------------");
        System.out.println("Detalhes do Voo:");
        System.out.println("----------------------------");
        System.out.println("ID do Voo: " + idVoo);
        System.out.println("Nome do Voo: " + nomeVoo);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Horário de Partida: " + horarioPartida);
        System.out.println("Horário de Chegada: " + horarioChegada);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Preço: $" + preço);
        System.out.println("Passagens Reservadas: " + passagensReservadas);
        System.out.println();
    }

    public void reservarPassagem() {
        if (passagensReservadas < capacidade) {
            passagensReservadas++;
            System.out.println("Passagem reservada com sucesso.");
        } else {
            System.out.println("Desculpe, o voo está totalmente reservado.");
        }
    }
}
