package com.marcos.study.poo.polimorfismo;

import  com.marcos.study.poo.polimorfismo.Animal;

public class Gato extends Animal{

    private String cor; 

    public Gato(String nome, int patas,String raca, String cor){
        super(nome, patas, raca);
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void mostrar(){
        super.show();
        System.out.println("Cor: "+cor);
    } 


    public void miar(){
        System.out.println("miau... miau...");
    }

    public void show(){
        super.show();
        System.out.println("Cor: "+cor);
    }

    @Override
    public void mover(){
        System.out.println(getNome() +" está se movendo");
    }
}
