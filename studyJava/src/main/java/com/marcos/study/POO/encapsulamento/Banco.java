package com.marcos.study.poo.encapsulamento;


public class Banco {

    private String titular;
    private double saldo;
    private double credito;

    public Banco (String titular){
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){

        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void overview(){
        System.out.println("Titular da conta é: "+ titular);
        System.out.println("Seu saldo é de: "+ saldo);
    }
}