import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculdoraDeImposto;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;

public class App {
    public static void main(String[] args) throws Exception {
        // testandoOrcamento();
        testaPedido();
    }
    public static void testandoOrcamento(){
        Orcamento orcamento = new Orcamento(new BigDecimal(501), 5);
        CalculdoraDeImposto calculdoraDeImposto = new CalculdoraDeImposto();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        
        BigDecimal imposto = calculdoraDeImposto.calcular(orcamento, new ISS());
        System.out.println(imposto);

        BigDecimal desconto = calculadoraDeDesconto.calcular(orcamento);
        System.out.println(desconto);
    }
    public static void testaPedido(){
        GeraPedido gerador = new GeraPedido("client", new BigDecimal(100), 2);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(
                new SalvarPedido(),
                new EnviarEmailPedido()
            )
        );
        handler.executa(gerador);
    }
}
