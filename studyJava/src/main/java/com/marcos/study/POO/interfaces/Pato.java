package com.marcos.study.poo.interfaces;

import com.marcos.study.poo.interfaces.Avoide;
import com.marcos.study.poo.interfaces.Nadade;


public class Pato implements Avoide, Nadade{

    public void hello(){
        int a =2;
    }

    @Override
    public final void voar(){

        System.out.println("Pata está voando...");
    }

    @Override
    public final void nadar(){
        System.out.println("Pato está nadando");
    }

}
