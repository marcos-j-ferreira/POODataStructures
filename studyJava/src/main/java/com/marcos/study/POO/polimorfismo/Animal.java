package com.marcos.study.poo.polimorfismo;

public class Animal {

    private String nome;
    private int patas;
    private String raca;

    public Animal(String nome, int patas, String raca){
        this.nome = nome;
        this.raca = raca;
        this.patas = patas;
    } 

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setPatas(int numeroPatas){
        this.patas = numeroPatas;
    }

    public void setRaca(String nomeRaca){
        this.raca = nomeRaca;
    }

    public String getNome (){
        return nome;
    }

    public String getRaca (){
        return raca;
    }

    public int getPatas (){
        return patas;
    }

    public void show(){
        System.out.println("Animal: "+ nome+ "\nRaça: "+ raca + "\nNúmero de patas: "+ patas);
    }

    public void mover(){
        System.out.println("Animal movendo");
    }

}
