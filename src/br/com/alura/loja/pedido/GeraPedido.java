package br.com.alura.loja.pedido;

import java.math.BigDecimal;


public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;
    public GeraPedido(String client, BigDecimal valorOrcamento, int quantidadeItens){
        this.cliente = client;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }
    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

}
