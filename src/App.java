import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculdoraDeImposto;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class App {
    public static void main(String[] args) throws Exception {
        Orcamento orcamento = new Orcamento(new BigDecimal(501), 5);
        CalculdoraDeImposto calculdoraDeImposto = new CalculdoraDeImposto();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        
        BigDecimal imposto = calculdoraDeImposto.calcular(orcamento, new ISS());
        System.out.println(imposto);

        BigDecimal desconto = calculadoraDeDesconto.calcular(orcamento);
        System.out.println(desconto);
    }
}
