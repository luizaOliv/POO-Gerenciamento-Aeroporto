package com.mycompany.sistemagerenciamentoaeroporto;

import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamentoAeroporto {
    public static void main(String[] args) {
        // Criar uma instância de GerenciamentoAeroporto
        GerenciamentoAeroporto aeroporto = new GerenciamentoAeroporto("Aeroporto Internacional de Incheon(ICN)", "Seul", "Incheon");
        aeroporto.abrir();

        // Criar uma instância de BalcãoDePassagens
        BalcãoDePassagens balcão = new BalcãoDePassagens(1, 101, "Coreia do Sul(SK)", "Brasil(BR)", 600.0, 201);
        balcão.DetalhesPassagem();


        // Criar uma instância de Voo
        Voo voo = new Voo(201, "Air 801", 200, "10:00", "12:00", "Coreia do Sul(SK)", "Brasil(BR)", 150.0);
        voo.DetalhesVoo();
        voo.reservarPassagem();

        // Criar uma instância de FuncionáriosAeroporto
        FuncionáriosAeroporto funcionárioAeroporto = new FuncionáriosAeroporto(301, "Kwon Ji-yong", 5000.0, "Piloto", "Departamento");
        funcionárioAeroporto.DetalhesFuncionarioAeroporto();

        // Criar uma instância de PistaDePouso
        PistaDePouso pista = new PistaDePouso(1, "Air 801", false);
        pista.DetalhesPistaDePouso();
        System.out.println("A pista está ocupada? " + pista.estaOcupada());

        // Criar uma lista de passageiros
        List<Passageiros> listaDePassageiros = new ArrayList<>();
        listaDePassageiros.add(new Passageiros(101, "Joana", 25, 1, 1));
        listaDePassageiros.add(new Passageiros(102, "Marcelo", 30, 2, 2));
        
        // Exibir detalhes de todos os passageiros
        for (Passageiros passageiro : listaDePassageiros) {
            passageiro.DetalhesPassageiro();
        }

        // Criar uma instância de PainelDeAvisos
        PainelDeAvisos painelDeAvisos = new PainelDeAvisos(201, "Air 801", "10:30", "11:30", "Coreia do Sul(SK)", "Brasil(BR)");
        painelDeAvisos.Detalhes();
        painelDeAvisos.StatusDoVoo(false, listaDePassageiros.size());

        // Criar uma lista de bagagens
        List<Bagagem> listaDeBagagens = new ArrayList<>();
        listaDeBagagens.add(new Bagagem(1, 101, 201, 2));
        listaDeBagagens.add(new Bagagem(2, 102, 201, 1));

        // Exibir detalhes de todas as bagagens
        for (Bagagem bagagem : listaDeBagagens) {
            bagagem.DetalhesBagagem();
            System.out.println();
            bagagem.StatusDaBagagem();
        }
    }
}
