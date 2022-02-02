package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
    
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal desconto = new DescontoPorPreco(
            new DescontoPorQuantidade(
                new SemDesconto()
            )
        ).calcular(orcamento);
        return desconto;
    }
}
