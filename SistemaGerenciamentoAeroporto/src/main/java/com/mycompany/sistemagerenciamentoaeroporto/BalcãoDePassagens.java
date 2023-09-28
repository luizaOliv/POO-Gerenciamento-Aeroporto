package com.mycompany.sistemagerenciamentoaeroporto;


public class BalcãoDePassagens {
    private int idPassagem;
    private int idPassageiro;
    private String origem;
    private String destino;
    private double preço;
    private int idVoo;

    public BalcãoDePassagens(int idPassagem, int idPassageiro, String origem, String destino, double preço, int idVoo) {
        this.idPassagem = idPassagem;
        this.idPassageiro = idPassageiro;
        this.origem = origem;
        this.destino = destino;
        this.preço = preço;
        this.idVoo = idVoo;
    }

    public void DetalhesPassagem() {
        System.out.println("----------------------------");
        System.out.println("Detalhes da Passagem:");
        System.out.println("----------------------------");
        System.out.println("ID da Passagem: " + idPassagem);
        System.out.println("ID do Passageiro: " + idPassageiro);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Preço: $" + preço);
        System.out.println("ID do Voo: " + idVoo);
        System.out.println();
    }
}

