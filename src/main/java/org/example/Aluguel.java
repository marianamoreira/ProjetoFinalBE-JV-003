package org.example;

import java.math.BigDecimal;

public class Aluguel{
    BigDecimal valorAluguel;
    Cliente cliente;
    Veiculo veiculo;
    int diarias;
    double desconto;

    public Aluguel(Cliente cliente, Veiculo veiculo, int diarias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diarias = diarias;
        setDesconto(diarias);
        setValorAluguel(desconto,diarias);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = cliente.obterDesconto(diarias);
    }
    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double desconto, int diarias) {
        this.valorAluguel = veiculo.getDiaria().multiply(BigDecimal.valueOf(diarias)).
                subtract(veiculo.getDiaria().multiply(BigDecimal.valueOf(diarias).multiply(BigDecimal.valueOf(desconto))));
    }
}
