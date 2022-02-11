package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedido implements AcaoPedido{
    public void executar(Pedido pedido){
        System.out.println("Salva pedido no banco");
    }
}
