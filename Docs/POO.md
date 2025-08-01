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
[Classe mãe: Pessoa.java](../studyJava/src/main/java/com/marcos/study/POO/heranca/Pessoa.java)
[Classe filha: Aluno.java](../studyJava/src/main/java/com/marcos/study/POO/heranca/Aluno.java)
