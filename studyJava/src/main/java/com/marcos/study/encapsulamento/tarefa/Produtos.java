package com.marcos.study.encapsulamento.tarefa;



public class Produtos {

    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    } 

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setPreco(double novoPreco){

        if(novoPreco > 0){
            preco = novoPreco;
        }
    }

    public void adicionarEstoque(int valor){
        quantidade += valor;
    }

    public void removerEstoque( int valor){

        if(quantidade > 0 && valor <= quantidade){
            quantidade -= valor;
        }else{
            System.out.println("Quantidade excede o quantidade em estoque");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Produto: "+ nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Estoque: "+ quantidade);
    }
}