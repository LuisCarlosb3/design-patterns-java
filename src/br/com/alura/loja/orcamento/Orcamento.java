package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;
    public Orcamento(BigDecimal valor, int quantidadeItens){
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor(){
        return valor;
    }
    public int getQuantidadeDeItens(){
        return quantidadeItens;
    }
    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacao;
    }
    public void setSituacao(SituacaoOrcamento novaSituacaoOrcamento){
        this.situacao = novaSituacaoOrcamento;
    }
    public void aplicatDescontoExtra(){
        BigDecimal valorDesconto = this.situacao.calcularValorDesconto(this);
        this.valor = this.valor.subtract(valorDesconto);
    }
    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }

}
