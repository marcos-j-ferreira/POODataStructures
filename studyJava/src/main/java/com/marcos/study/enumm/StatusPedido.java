package com.marcos.study.enumm;

public enum StatusPedido {

    PENDENTE("Pedido pendente"),
    PROCESSANDO("Pedido em processamento"),
    ENTREGUE("Pedido entregue");

    private String descricao;

    StatusPedido(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}


