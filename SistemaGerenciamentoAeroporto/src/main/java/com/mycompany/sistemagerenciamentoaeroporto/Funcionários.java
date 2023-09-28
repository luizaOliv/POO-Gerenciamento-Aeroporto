package com.mycompany.sistemagerenciamentoaeroporto;

public class Funcionários {
    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;

    public Funcionários(int idFuncionario, String nomeFuncionario, double salárioFuncionário) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public void DetalhesFuncionario() {
        System.out.println("----------------------------");
        System.out.println("Detalhes do Funcionário:");
        System.out.println("----------------------------");
        System.out.println("ID do Funcionário: " + idFuncionario);
        System.out.println("Nome do Funcionário: " + nomeFuncionario);
        System.out.println("Salário do Funcionário: $" + salarioFuncionario);
        System.out.println();
    }
}

