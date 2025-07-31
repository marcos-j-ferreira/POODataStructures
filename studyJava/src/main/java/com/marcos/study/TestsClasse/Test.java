package com.marcos.study.testsclasse;


// classe de encapsulamento
import com.marcos.study.encapsulamento.Banco;
import com.marcos.study.encapsulamento.tarefa.Produtos;


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
}