package com.marcos.study.poo.heraca;


public class Pessoa {

    //getter e setter
    private String nome;
    private int idade;

    //poder ser acessada de outra classe que herdar
    protected int fases; 

    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome(){
            return nome;
    }

    public int getIdade(){

        if(idade == -1){
            return -1;
        }else{
            return idade;
        }
    }


    public void setNome(String valueNome){

        if(valueNome == null || valueNome.isEmpty()){
            System.out.println("Não pode ser variavel vazia");
        }else{
            this.nome = valueNome;
        }
    }

    public void setIdade(int valueIdade){

        if(valueIdade < 0){
            System.out.println("Não pode ser um valor vazio");
        }else{
            this.idade = valueIdade;
        }
    }

    public void exibirInfo(){

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }

    public void setFases (int value){
        this.fases = value;
    }
}