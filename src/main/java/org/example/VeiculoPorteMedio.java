package org.example;

import java.math.BigDecimal;

public class VeiculoPorteMedio extends Veiculo {
    BigDecimal diaria = new BigDecimal("150");
    public VeiculoPorteMedio(Marca marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }
    public BigDecimal getDiaria() {
        return diaria;
    }
}