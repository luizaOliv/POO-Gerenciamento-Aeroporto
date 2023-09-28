package com.mycompany.sistemagerenciamentoaeroporto;

public class FuncionáriosAeroporto extends Funcionários {
    private String cargo;


    public FuncionáriosAeroporto(int idFuncionario, String nomeFuncionario, double salarioFuncionario, String cargo, String departamento) {
        super(idFuncionario, nomeFuncionario, salarioFuncionario);
        this.cargo = cargo;
    }

    public void DetalhesFuncionarioAeroporto() {
        System.out.println("Cargo: " + cargo);
        System.out.println();
        
    }
}
