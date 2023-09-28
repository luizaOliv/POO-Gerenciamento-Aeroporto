package com.mycompany.sistemagerenciamentoaeroporto;

public class Bagagem {
    private int idBagagem;
    private int idPassageiro;
    private int idVoo;
    private int quantidadeDeBagagens;
    private boolean verificadoEEmbarcado;

    public Bagagem(int idBagagem, int idPassageiro, int idVoo, int quantidadeDeBagagens) {
        this.idBagagem = idBagagem;
        this.idPassageiro = idPassageiro;
        this.idVoo = idVoo;
        this.quantidadeDeBagagens = quantidadeDeBagagens;
        this.verificadoEEmbarcado = false;
    }

    public void DetalhesBagagem() {
        System.out.println("----------------------------");
        System.out.println("Detalhes da Bagagem:");
        System.out.println("----------------------------");
        System.out.println("ID da Bagagem: " + idBagagem);
        System.out.println("ID do Passageiro: " + idPassageiro);
        System.out.println("ID do Voo: " + idVoo);
        System.out.println("Quantidade de Bagagens: " + quantidadeDeBagagens);
        System.out.println("Verificado e Embarcado: " + (verificadoEEmbarcado ? "Sim" : "Não"));
        System.out.println();
    }

    public void StatusDaBagagem() {
        if (!verificadoEEmbarcado) {
            verificadoEEmbarcado = true;
            System.out.println("Bagagem verificada e embarcada com sucesso.");
        } else {
            System.out.println("A bagagem já foi verificada e embarcada.");
        }
    }
}
