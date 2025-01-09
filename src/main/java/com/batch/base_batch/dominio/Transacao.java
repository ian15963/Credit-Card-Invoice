package com.batch.base_batch.dominio;

import java.util.Date;

public class Transacao {

    private Long id;
    private CartaoCredito cartao;
    private String descricao;
    private Double valor;
    private Date data;

    public Transacao() {
    }

    public Transacao(Long id, CartaoCredito cartao, String descricao, Double valor, Date data) {
        this.id = id;
        this.cartao = cartao;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", cartao=" + cartao +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
