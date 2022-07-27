package org.example;

public abstract class Cliente {
    private String nome;
    private String telefone;


    public Cliente(String nome, String telefone) {
        this.nome = nome;
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length()<10){
            throw new IllegalArgumentException("Número de telefone inválido. Não foi possível concluir a operação.");
        }
        this.telefone = telefone;
    }

    public abstract double obterDesconto(int diarias);
}
