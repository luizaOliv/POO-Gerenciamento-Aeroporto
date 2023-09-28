package com.mycompany.sistemagerenciamentoaeroporto;

import java.util.ArrayList;
import java.util.List;

public class Passageiros {
    private int idPassageiro;
    private String nomePassageiro;
    private int idadePassageiro;
    private int idPassagem;
    private int idBagagem;

    public Passageiros(int idPassageiro, String nomePassageiro, int idadePassageiro, int idPassagem, int idBagagem) {
        this.idPassageiro = idPassageiro;
        this.nomePassageiro = nomePassageiro;
        this.idadePassageiro = idadePassageiro;
        this.idPassagem = idPassagem;
        this.idBagagem = idBagagem;
    }

    public void DetalhesPassageiro() {
        System.out.println("----------------------------");
        System.out.println("Detalhes do Passageiro:");
        System.out.println("----------------------------");
        System.out.println("ID do Passageiro: " + idPassageiro);
        System.out.println("Nome do Passageiro: " + nomePassageiro);
        System.out.println("Idade do Passageiro: " + idadePassageiro);
        System.out.println("ID da Passagem: " + idPassagem);
        System.out.println("ID da Bagagem: " + idBagagem);
        System.out.println();
    }

    public void Checkin() {
        System.out.println("Passageiro fez check-in com sucesso.");
    }
}
