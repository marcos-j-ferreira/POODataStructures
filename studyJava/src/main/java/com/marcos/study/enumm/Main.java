package com.marcos.study.enumm;

import com.marcos.study.enumm.StatusPedido;


public class Main {

    public static void main(String[] args){

        StatusPedido status = StatusPedido.ENTREGUE;

        System.out.println("Status: "+ status);
        System.out.println("Descrição: "+ status.getDescricao());
    }
}