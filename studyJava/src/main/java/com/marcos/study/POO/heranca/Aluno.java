package com.marcos.study.poo.heraca;


public class Aluno extends Pessoa{

    private String curso;

    public Aluno (String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    } 

    // variáveis privadas, tem que usar o getter e setter;
    public void curso(){
        System.out.println("Curso: "+ curso+ " Aluno: "+ getNome()+ " idade: "+ getIdade());
    }

    // variáveis com protected, pode ser acessadas sem getter ou setter;
    public void infoAll(){
        // pode chamar métods de outra classe.
        super.exibirInfo();
        System.out.println("Curso: " +curso+ " Fases: "+ fases);
    }

}