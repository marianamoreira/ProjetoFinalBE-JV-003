package org.example;

public abstract class Veiculo {
    private Marca marca;
    private String modelo;
    private String placa;

    public Veiculo(Marca marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public enum Marca {
        BMW,
        MERCEDES,
        FORD,
        RENAULT,
        TESLA,
        VW;
    }
}
