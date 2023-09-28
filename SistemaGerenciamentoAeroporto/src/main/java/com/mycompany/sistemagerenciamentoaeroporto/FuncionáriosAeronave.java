package com.mycompany.sistemagerenciamentoaeroporto;

public class FuncionáriosAeronave extends Funcionários {
    private String cargo;

    public FuncionáriosAeronave(int idFuncionario, String nomeFuncionario, double salarioFuncionario, String cargo) {
        super(idFuncionario, nomeFuncionario, salarioFuncionario);
        this.cargo = cargo;
    }

    public void DetalhesFuncionarioAeronave() {
        DetalhesFuncionario();
        System.out.println("Cargo: " + cargo);
    }
}
