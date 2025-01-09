package com.batch.base_batch.dominio;

import java.util.ArrayList;
import java.util.List;

public class FaturaCartaoCredito {

    private CartaoCredito cartao;
    private Cliente cliente;
    private List<Transacao> transacoes;

    public FaturaCartaoCredito() {
        transacoes = new ArrayList<>();
    }

    public FaturaCartaoCredito(CartaoCredito cartao, Cliente cliente, List<Transacao> transacoes) {
        this.cartao = cartao;
        this.cliente = cliente;
        this.transacoes = transacoes;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    @Override
    public String toString() {
        return "FaturaCartaoCredito{" +
                "cartao=" + cartao +
                ", cliente=" + cliente +
                ", transacoes=" + transacoes +
                '}';
    }
}
