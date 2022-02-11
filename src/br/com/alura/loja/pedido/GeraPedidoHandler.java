package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoPedido;

public class GeraPedidoHandler {
    private List<AcaoPedido> acoes;

    public GeraPedidoHandler(List<AcaoPedido> acoes){
        this.acoes=acoes;
    }
    public void executa(GeraPedido gerador){
        Orcamento orcamento = new Orcamento(gerador.getValorOrcamento(), gerador.getQuantidadeItens());
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(gerador.getCliente(), data, orcamento);
        
        acoes.forEach(a->a.executar(pedido));
    }
}
