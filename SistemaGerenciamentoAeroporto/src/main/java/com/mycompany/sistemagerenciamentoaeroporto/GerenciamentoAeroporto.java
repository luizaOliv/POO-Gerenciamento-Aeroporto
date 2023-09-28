package com.mycompany.sistemagerenciamentoaeroporto;

public class GerenciamentoAeroporto {
    private String nomeAeroporto;
    private String nomeCidade;
    private String area;
    private boolean estaAberto;

    public GerenciamentoAeroporto(String nomeAeroporto, String nomeCidade, String area) {
        this.nomeAeroporto = nomeAeroporto;
        this.nomeCidade = nomeCidade;
        this.area = area;
        this.estaAberto = false;
    }

    public void abrir() {
        estaAberto = true;
        System.out.println("O aeroporto está agora aberto.");
        System.out.println();
    }

    public void fechar() {
        estaAberto = false;
        System.out.println("O aeroporto está agora fechado.");
    }
}

