package com.marcos.study.testsclasse;


// classe de encapsulamento
import com.marcos.study.poo.encapsulamento.Banco;
import com.marcos.study.poo.encapsulamento.tarefa.Produtos;

// classe herança
import com.marcos.study.poo.heraca.Pessoa;
import com.marcos.study.poo.heraca.Aluno;


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
}