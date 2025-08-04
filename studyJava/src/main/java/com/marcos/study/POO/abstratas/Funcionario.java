package com.marcos.study.poo.abstratas;


public abstract class Funcionario {

    private String nome;
    private int  salario;

    public abstract void calcularSalario();
    public abstract void exibirInformacoes();

    public Funcionario(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }


    public String getNome(){
        return nome;
    }

    public int getSalario(){
        return salario;
    }

    public void setNome(String value){
        this.nome = value;
    }

    public void setSalario(int valorSalario){
        this.salario = valorSalario;
    }

} 