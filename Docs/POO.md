## Encapsulamento

Encapsulamento é uma forma de controlar o **escopo** e o **acesso aos dados** dentro de uma classe. Ele permite proteger os atributos da classe e manipular seus valores de forma segura. As variáveis podem ser definidas com diferentes níveis de acesso:

* `private`: A variável só pode ser acessada por meio de métodos públicos (getters e setters). Essa abordagem protege os dados e impede modificações diretas.
* `protected`: Permite que classes filhas (que estendem a classe atual) acessem o atributo diretamente.

> Em resumo, o encapsulamento é uma prática que promove segurança, organização e controle sobre os dados manipulados por uma classe.

**Exemplo de classe com encapsulamento:**
[Encapsulamento](../studyJava/src/main/java/com/marcos/study/POO/encapsulamento/Banco.java)

---

## Herança

Herança é um princípio da orientação a objetos que permite que uma classe (chamada de **classe filha**) herde atributos e métodos de outra classe (chamada de **classe mãe**).

Essa prática não só reduz a repetição de código, como também estabelece uma hierarquia entre as classes, promovendo reutilização e organização.

* A classe filha pode acessar os atributos da classe mãe, respeitando os níveis de acesso:

  * Se o atributo for `private`, será necessário utilizar os getters e setters.
  * Se for `protected`, ele poderá ser acessado diretamente pela classe filha.
* A palavra-chave `super` pode ser utilizada para chamar métodos ou construtores da classe mãe.

**Exemplos de classes com herança:**
[Classe mãe: Pessoa.java](../studyJava/src/main/java/com/marcos/study/POO/heranca/Pessoa.java) <----->
[Classe filha: Aluno.java](../studyJava/src/main/java/com/marcos/study/POO/heranca/Aluno.java)


## Polimorfismo

O polimorfismo permite que uma classe filha herde métodos e atributos de uma classe mãe, mas possa **sobrescrever** esses métodos para alterar seu comportamento. Assim, o mesmo método pode ter diferentes implementações, dependendo da classe que o utiliza. Isso promove **flexibilidade**, **reutilização de código** e **extensibilidade** em projetos orientados a objetos.

### Palavras-chave importantes:

* `extends`: Indica que uma classe herda de outra.
* `@Override`: Indica que um método está sendo sobrescrito da classe pai.
* `super`: Refere-se à superclasse (classe mãe).

---- 
>Próximos tópicos a serem vistos:
* `abstract`: Define uma classe ou método abstrato, que deve ser implementado pelas subclasses.
* `interface`: Define um contrato que pode ser implementado por múltiplas classes (também usado para polimorfismo).
* `implements`: Indica que uma classe implementa uma interface.

---

### Exemplo básico de polimorfismo com herança

**Classe mãe (`Animal.java`)**

```java
public class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}
```

**Classe filha (`Gato.java`)**

```java
public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia.");
    }
}
```

**Classe principal (`Main.java`)**

```java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Gato(); // Polimorfismo: um Animal que é um Gato
        meuAnimal.fazerSom(); // Saída: "O gato mia."
    }
}
```

> Exemplo real no projeto:
> [Classe mãe: `Animal.java`](../studyJava/src/main/java/com/marcos/study/POO/polimorfismo/Animal.java) <----->
> [Classe filha com polimorfismo: `Gato.java`](../studyJava/src/main/java/com/marcos/study/POO/polimorfismo/Gato.java)

---

