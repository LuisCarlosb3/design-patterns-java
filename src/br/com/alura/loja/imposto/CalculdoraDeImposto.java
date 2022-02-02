package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculdoraDeImposto {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
        return tipoImposto.calcular(orcamento);
    }
}
