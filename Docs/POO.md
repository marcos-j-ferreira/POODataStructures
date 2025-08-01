## Encapsulamento

Uma forma de definir o scope das varáveis, dos dados que serão minipoludos por ela, podendo definir uma variável como:

- `private:` Ela só pode ser acessivel com getter e setter, atráves de métods, dessa forma protege os dados.
- `protected:` A classe que herda pode acessar a variável.

> Em suma é uma forma mais segura de proteger os dados, variáveis que ela vai manipular.

**Uma classe com esse modelo:**  [Encapsulamento](../studyJava/src/main/java/com/marcos/study/POO/encapsulamento/Banco.java)


## Herança 

Ela herda valores e métodos de outra classe, não só economizando na escrita, mas permite que as classes tenham uma ligação, ou hierárquia com outras classes. 
- A classe principal é chamada de `classe mãe`

Você pode acessar as variáveis e fazer modificações nela, se atentando para o escopo, se elas for `private` terá que usar getter e setter, se for só `protected` pode ser acessadas.

- importante destacar que pode ser chamado outros métodos com `super`.

**Examplo de classe:** [Classe mãe](../studyJava/src/main/java/com/marcos/study/POO/heranca/Pessoa.java) <------> 
[Classe que herda](../studyJava/src/main/java/com/marcos/study/POO/heranca/Aluno.java)