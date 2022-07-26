package org.example;

import java.math.BigDecimal;

public class VeiculoSUV extends Veiculo{
    BigDecimal diaria = new BigDecimal("200");
    public VeiculoSUV(Marca marca, String modelo, String placa) {
        super( marca, modelo, placa);
    }
    public BigDecimal getDiaria() {
        return diaria;
    }
}
