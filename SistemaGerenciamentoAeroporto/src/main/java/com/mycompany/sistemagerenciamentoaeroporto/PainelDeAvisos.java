package com.mycompany.sistemagerenciamentoaeroporto;

public class PainelDeAvisos {
    private int idVoo;
    private String nomeVoo;
    private String horaChegada;
    private String horaPartida;
    private String origem;
    private String destino;

    public PainelDeAvisos(int idVoo, String nomeVoo, String horaChegada, String horaPartida, String origem, String destino) {
        this.idVoo = idVoo;
        this.nomeVoo = nomeVoo;
        this.horaChegada = horaChegada;
        this.horaPartida = horaPartida;
        this.origem = origem;
        this.destino = destino;
    }

    public void Detalhes() {
        System.out.println("----------------------------");
        System.out.println("Detalhes do Voo:");
        System.out.println("----------------------------");
        System.out.println("ID do Voo: " + idVoo);
        System.out.println("Nome do Voo: " + nomeVoo);
        System.out.println("Hora de Chegada: " + horaChegada);
        System.out.println("Hora de Partida: " + horaPartida);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println();
    }

    public void StatusDoVoo(boolean estáAtrasado, int númeroDePassageiros) {
        System.out.println("----------------------------");
        System.out.println("Status do Voo:");
        System.out.println("----------------------------");
        System.out.println("ID do Voo: " + idVoo);
        System.out.println("Nome do Voo: " + nomeVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Atrasado: " + (estáAtrasado ? "Sim" : "Não"));
        System.out.println("Número de Passageiros: " + númeroDePassageiros);
        System.out.println();
    }
}
