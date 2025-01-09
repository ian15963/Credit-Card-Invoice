package com.batch.base_batch.dominio;

public class CartaoCredito {

    private Long numero;
    private Cliente cliente;

    public CartaoCredito() {
    }

    public CartaoCredito(Long numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numero=" + numero +
                ", cliente=" + cliente +
                '}';
    }
}
