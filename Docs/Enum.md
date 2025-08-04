## Enum


Um **`enum`** (ou *enumeration*) é um **tipo especial de classe** usado para representar um **conjunto fixo de constantes**. Ele é muito útil quando você precisa de um número limitado e conhecido de valores, como dias da semana, estados de um processo, ou tipos de usuário.

> Exemplo de enum: [`Processos`](../studyJava/src/main/java/com/marcos/study/enumm/StatusPedido.java)

### Características do `enum`:

* Os valores do `enum` são **constantes**, geralmente escritas em **letras maiúsculas**.
* Pode conter:

  * **Construtores**
  * **Atributos**
  * **Métodos**
* Cada valor é na verdade uma **instância** da enumeração.

#### Palavra-chave:

* `enum`: define um tipo enumerado.

#### Exemplo básico:

```java
public enum Cargo {
    DESENVOLVEDOR,
    GERENTE,
    TESTADOR
}
```

### Exemplo com atributos e métodos:

```java
public enum Cargo {
    DESENVOLVEDOR("Desenvolvedor"),
    GERENTE("Gerente de Projetos"),
    TESTADOR("Analista de Testes");

    private final String descricao;

    Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
```

### Como usar:

```java
Cargo cargo = Cargo.DESENVOLVEDOR;

switch (cargo) {
    case DESENVOLVEDOR:
        System.out.println("É um dev!");
        break;
    case GERENTE:
        System.out.println("É um gerente!");
        break;
}
```
> Exemplo de uma implementação [Main](../studyJava/src/main/java/com/marcos/study/enumm/Main.java)