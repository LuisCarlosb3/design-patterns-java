package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
    public void executa(GeraPedido gerador){
        Orcamento orcamento = new Orcamento(gerador.getValorOrcamento(), gerador.getQuantidadeItens());
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(gerador.getCliente(), data, orcamento);
        //envia email
        
    }
}
