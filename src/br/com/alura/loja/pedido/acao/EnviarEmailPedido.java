package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoPedido{
    public void executar(Pedido pedido){
        System.out.println("Envia email com dados do pedido");
    }
}
