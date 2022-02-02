package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoPorPreco extends Desconto{

    public DescontoPorPreco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getValor().compareTo(new BigDecimal(500))>0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
       return this.proximo.calcular(orcamento);
   } 
}
