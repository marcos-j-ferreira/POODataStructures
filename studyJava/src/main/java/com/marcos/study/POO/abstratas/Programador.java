package com.marcos.study.poo.abstratas;


import com.marcos.study.poo.abstratas.Funcionario;


public class Programador extends Funcionario{

    public Programador(String nome, int salario){
        super(nome, salario);
    }

    int desconto = 0;
    int ss = getSalario();

    @Override
    public void calcularSalario(){
        desconto = 242 * 10;
        ss = ss - desconto;
    } 

    @Override
    public void exibirInformacoes(){
        System.out.println("Profissional: "+ getNome());
        System.out.println("Sálario base: "+ getSalario());
        System.out.println("Desconto de: "+ desconto );
        System.out.println("Sálario total: "+ ss);
    }
}