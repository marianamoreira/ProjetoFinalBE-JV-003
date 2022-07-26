package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Veiculo> veiculos = new ArrayList<>();
        List<Aluguel> alugueis = new ArrayList<>();
        clientes.add(new ClientePF("Ana", "1234567890", "12345678912", "Ana"));
        clientes.add(new ClientePJ("Empresa", "1234567890", "12345678912345"));
        veiculos.add(new VeiculoSUV(Veiculo.Marca.BMW, "SUV", "SUV"));
        veiculos.add(new VeiculoPorteMedio(Veiculo.Marca.BMW, "Medio", "Medio"));
        veiculos.add(new VeiculoPortePequeno(Veiculo.Marca.BMW, "Pequeno", "Pequeno"));
    }
}