package org.example;

import java.math.BigDecimal;

public class VeiculoPortePequeno extends Veiculo {
    BigDecimal diaria = new BigDecimal("100");

    public VeiculoPortePequeno(Marca marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }

    public BigDecimal getDiaria() {
        return diaria;
    }
}
