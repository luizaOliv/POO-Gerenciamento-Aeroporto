package com.mycompany.sistemagerenciamentoaeroporto;

public class PistaDePouso {
    private int numeroDaPista;
    private String nomeVoo;
    private boolean statusOcupado;

    public PistaDePouso(int númeroDaPista, String nomeVoo, boolean statusOcupado) {
        this.numeroDaPista = numeroDaPista;
        this.nomeVoo = nomeVoo;
        this.statusOcupado = statusOcupado;
    }

    public void DetalhesPistaDePouso() {
        System.out.println("----------------------------");
        System.out.println("Detalhes da Pista de Pouso:");
        System.out.println("----------------------------");
        System.out.println("Número da Pista: " + numeroDaPista);
        System.out.println("Nome do Voo: " + nomeVoo);
        System.out.println("Status de Ocupação: " + (statusOcupado ? "Ocupada" : "Não Ocupada"));
        System.out.println();
    }

    public boolean estaOcupada() {
        return statusOcupado;
    }
}
