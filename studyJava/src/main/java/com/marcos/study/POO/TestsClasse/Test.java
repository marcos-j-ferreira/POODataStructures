package com.marcos.study.testsclasse;


// classe de encapsulamento
import com.marcos.study.poo.encapsulamento.Banco;
import com.marcos.study.poo.encapsulamento.tarefa.Produtos;

// classe herança
import com.marcos.study.poo.heraca.Pessoa;
import com.marcos.study.poo.heraca.Aluno;

import com.marcos.study.poo.polimorfismo.Animal;
import com.marcos.study.poo.polimorfismo.Gato;


public class Test{

    public void encapsulamento(){

    //  classe de encapsulamento
        Banco b1 = new Banco("Marcos");
        b1.depositar(1000);
        b1.sacar(1500);
        b1.overview();

    // exercicio da classe encapsulamento
        Produtos p1 = new Produtos("Mause", 120.00, 10);

        p1.setPreco(99.98);
        p1.adicionarEstoque(5);
        p1.removerEstoque(16);
        p1.exibirInformacoes();

    }

    public void heraca(){

        // Pessoa pessoa = new Pessoa("marcos", 20);
        // pessoa.exibirInfo();
        // pessoa.setNome("Luiz");
        // pessoa.setIdade(-1);
        // pessoa.exibirInfo();

        Aluno aluno = new Aluno("Marcos", 20, "ADS");
        aluno.setFases(5);
        aluno.exibirInfo(); // método da classe mãe;
        aluno.curso(); 
        System.out.println("\n");
        aluno.infoAll(); // modificação da classe mãe;

    }
    public void polimorfismo(){
        Animal gato1 = new Gato("Spike", 4,"none", "Amarelo");
        Gato g1 = new Gato("Spike", 5,"none", "Amarelo");

        //gato1.mostrar(); não funciona

        gato1.show(); // Animal -> gato
        System.out.println("");
        g1.mostrar();  // Gato -> gato
        System.out.println("");
        g1.show();
        System.out.println("");
        g1.miar();
        //gato1.miar();
        System.out.println("");
        g1.mover();
        System.out.println("");
        gato1.mover();
        System.out.println("========== ");

        g1.setRaca("GTR");
        g1.setCor("White");
        g1.setNome("Rei da lua");
        g1.setPatas(100);
        //g1.set.

        g1.show();
        System.out.println("========== ");
        g1.mostrar();
        System.out.println("========== ");
        g1.mover();

    }
}