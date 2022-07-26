package org.example;

import java.math.BigDecimal;

public class Aluguel{
    Desconto desconto;
    BigDecimal valorAluguel;
    Cliente cliente;
    Veiculo veiculo;
    int diarias;
    public enum Desconto {
        DEZ,
        CINCO;
    }

    public Aluguel(Cliente cliente, Veiculo veiculo, int diarias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diarias = diarias;
        setDesconto(diarias);
        setValorAluguel(desconto,diarias);
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(int diarias) {
        this.desconto = desconto;
    }

    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Desconto desconto, int diarias) {
        this.valorAluguel = valorAluguel;
    }
}
